
import antlr4
from shaderlangVisitor import shaderlangVisitor
from shaderlangLexer import shaderlangLexer
from shaderlangParser import shaderlangParser
from shaderlangListener import shaderlangListener
from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
import os,sys

# print(os.getcwd()+"/test/test.ghshader")
# class MyshaderlangListener(shaderlangListener):
#     def enterExpr(self, ctx: shaderlangParser.ExprContext):
#         print("text:",ctx.getText(),"depth:",ctx.depth()
#               ,"children:",ctx.getChildren())
        
        
#         pass
#     def exitExpr(self, ctx: shaderlangParser.ExprContext):
#         print("exit:",ctx.getText(),ctx.depth())
#         pass
# class Myvisitor(shaderlangVisitor):
def getpath(shadername:str,path="./"):
    if path[-1]!="/":
        path+="/"
    return path+'/'.join(shadername.split("."))+"/"
    

def compilespv(shadername:str,shaderstage:str,shadercode:str,parmas,passname,path="./",uniforms=None):
    filename=passname+shaderstage
    if path[-1]!="/":
        path+="/"
    shaderpath=path+'/'.join(shadername.split("."))+"/"+f'{filename}.{str.lower(shaderstage)}'
    in_=0
    out_=0
    parmas_strlist=[]
    header='''
#version 450
#extension GL_ARB_separate_shader_objects : enable
    '''
    layout={"filename":f'{filename}.spv',"stage":shaderstage,"layouts":[]}
    for var in parmas:
        if var["direction"]=="in":
            parmas_strlist.append(f"layout(location={in_}) in {var['type']}  {var['varname']};\n")
            layout["layouts"].append({"location":in_,"type":var["type"],"name":var["varname"]})
            in_=+1
        elif var["direction"]=='out':
            parmas_strlist.append(f"layout(location={out_}) out {var['type']}  {var['varname']};\n")
            out_=+1
        elif var["direction"]=="uniform":
            pass
    
    os.makedirs(os.path.dirname(shaderpath), exist_ok=True)
    with open(shaderpath,"w",encoding="utf-8") as file:
        file.write(header+''.join(parmas_strlist)+shadercode)
        
        pass
    cmd=f".\\bin\\glslc.exe {shaderpath} -o {path+'/'.join(shadername.split('.'))+'/'+f'{filename}.spv'}"
    print("executing...",cmd)
    result=os.popen(cmd)
    print(result)
    return layout
    pass
class MyErrorListener(ErrorListener ):
    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(str(line) + ":" + str(column) + ": sintax ERROR, " + str(msg))
        print("Terminating Translation")
        sys.exit()

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print("Ambiguity ERROR, " + str(configs))
        sys.exit()

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print("Attempting full context ERROR, " + str(configs))
        sys.exit()

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print("Context ERROR, " + str(configs))
        sys.exit()
class Myvisitor(shaderlangVisitor):
    def __init__(self) -> None:
        super().__init__()
        self.shadername=''
        self.propertieslist=[]
        self.passes=[]
        self.errors=[]
        self.pathroot=''
        self.layout=[]
        pass
    
    def visitStruct(self, ctx: shaderlangParser.StructContext):
        dic_=dict()
        self.shadername=str(ctx.SHADERNAME())
        dic_["properties"]= self.visit(ctx.properties())
        dic_["subshader"]=self.visit(ctx.subshader())
        return dic_
    def visitPropertiesexp(self, ctx: shaderlangParser.PropertiesexpContext):
        # return super().visitPropertiesexp(ctx)'
        
        if ctx.property_() is not None:
            for property_ in ctx.property_():
                dic_property_=self.visit(property_)
   
                self.propertieslist.append(dic_property_)
        return self.propertieslist
    def visitPropertyexp(self, ctx: shaderlangParser.PropertyexpContext):
        dic_={"variablename":str(ctx.VARNAME(0)),"guiname":str(ctx.VARNAME(1)),"type":str(ctx.TYPE()),"initvalue":self.visit(ctx.initvalue())}
        if dic_['type']!=dic_["initvalue"]["type"]:
           
            
            errorstr=f"conflict type '{dic_['type']}' and '{dic_['initvalue']['type']}'  in { ctx.start.line,ctx.start.column}"
            print("error:",errorstr)
            self.errors.append(errorstr)
        return dic_
        pass
    def visitInitvaluexp(self, ctx: shaderlangParser.InitvaluexpContext):
        dic_={
            "type":str(ctx.TYPE()),
            "parmas":[float(str(num)) for num in ctx.NUMBER()]
            
        }
        return dic_
    def visitSubshaderexp(self, ctx: shaderlangParser.SubshaderexpContext):
        for pass_ in ctx.pass_():
            self.passes.append(self.visit(pass_))
            
        return {"passes":self.passes}
    def visitPassexp(self, ctx: shaderlangParser.PassexpContext):
        list_=[self.visit(stage_) for stage_ in ctx.stage()]
        
        return list_
    def visitStageexp(self, ctx: shaderlangParser.StageexpContext):
        dic_={"stagename":str(ctx.STAGENAME()),**self.visit(ctx.gpulang())
              
              }
        
        layout_=compilespv(self.shadername,dic_["stagename"],dic_['glsl'],dic_['varibles'],"pass"+str(len(self.passes)),self.pathroot
                           ,self.propertieslist)
        self.layout.append(layout_)
        return dic_
    def visitGpulangexp(self, ctx: shaderlangParser.GpulangexpContext):
        dic_={
            "varibles":[self.visit(varible) for varible in ctx.refuniform()],
            "glsl":str(ctx.PROGSTR()).replace("GLSLBEGIN","\n").replace("GLSLEND","\n")
        }
        
        return dic_
    def visitRefuniformexp(self, ctx: shaderlangParser.RefuniformexpContext):
        dic_={
            "direction":str(ctx.DIRECTION()),
            "type":str(ctx.TYPE()),
            "varname":str(ctx.VARNAME())
        }
        return dic_
    
with open("./test/test.ghshader","r",encoding="utf-8") as file:
    print("content:\n",file.read())
    args=sys.argv[1:]
    
    inputpath=args[0]
    outputpath=args[1]
    
    # data = file.read().replace('\n', '')
    file_stream=FileStream(inputpath)
    lexer=shaderlangLexer(file_stream)
    stream = CommonTokenStream(lexer)
    # print("tokens:",stream.)
    parser=shaderlangParser(stream)
    
    # parser.addParseListener(MyshaderlangListener())
    parser.addErrorListener(MyErrorListener())
    tree=parser.prog()
    print("first parse end")
    
    import json
    visitor= Myvisitor()
    visitor.pathroot=outputpath
    json_data=visitor.visit(tree)
    
    #save config json
    with open(getpath(visitor.shadername,visitor.pathroot)+'config.json','w',encoding='utf-8') as file:
         file.write(json.dumps({"layouts":visitor.layout,"properties":visitor.propertieslist,
                                "shadername":visitor.shadername
                                },indent=4))
    # print(visitor.visit(tree))
    # print(json.dumps(visitor.visit(tree),sort_keys=True, indent=4))


    