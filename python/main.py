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
    
with open("./test/test.ghshader","r",encoding="utf-8") as file:
    print("content:\n",file.read())
    # data = file.read().replace('\n', '')
    file_stream=FileStream("./test/test.ghshader")
    lexer=shaderlangLexer(file_stream)
    stream = CommonTokenStream(lexer)
    # print("tokens:",stream.)
    parser=shaderlangParser(stream)
    
    # parser.addParseListener(MyshaderlangListener())
    parser.addErrorListener(MyErrorListener())
    tree=parser.prog()
    print("END")
    # visitor= Myvisitor()
    # print(visitor.visit(tree))
    # printer = MyshaderlangListener()
    # walker = ParseTreeWalker()
    # print("\n")
    # walker.walk(printer, tree)

    