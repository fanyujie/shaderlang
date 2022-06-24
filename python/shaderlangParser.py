# Generated from ../g4/shaderlang.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,84,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,
        1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,
        3,1,3,4,3,48,8,3,11,3,12,3,49,1,3,1,3,1,4,1,4,1,4,4,4,57,8,4,11,
        4,12,4,58,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,5,7,71,8,7,10,
        7,12,7,74,9,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,0,0,9,0,2,4,6,
        8,10,12,14,16,0,0,77,0,18,1,0,0,0,2,27,1,0,0,0,4,32,1,0,0,0,6,44,
        1,0,0,0,8,53,1,0,0,0,10,62,1,0,0,0,12,64,1,0,0,0,14,72,1,0,0,0,16,
        79,1,0,0,0,18,19,5,1,0,0,19,20,5,2,0,0,20,21,5,15,0,0,21,22,5,2,
        0,0,22,23,5,3,0,0,23,24,3,2,1,0,24,25,3,6,3,0,25,26,5,4,0,0,26,1,
        1,0,0,0,27,28,5,5,0,0,28,29,5,3,0,0,29,30,3,4,2,0,30,31,5,4,0,0,
        31,3,1,0,0,0,32,33,5,15,0,0,33,34,5,6,0,0,34,35,5,2,0,0,35,36,5,
        15,0,0,36,37,5,2,0,0,37,38,5,7,0,0,38,39,5,16,0,0,39,40,5,8,0,0,
        40,41,5,9,0,0,41,42,5,18,0,0,42,43,5,10,0,0,43,5,1,0,0,0,44,45,5,
        11,0,0,45,47,5,3,0,0,46,48,3,8,4,0,47,46,1,0,0,0,48,49,1,0,0,0,49,
        47,1,0,0,0,49,50,1,0,0,0,50,51,1,0,0,0,51,52,5,4,0,0,52,7,1,0,0,
        0,53,54,5,12,0,0,54,56,5,3,0,0,55,57,3,12,6,0,56,55,1,0,0,0,57,58,
        1,0,0,0,58,56,1,0,0,0,58,59,1,0,0,0,59,60,1,0,0,0,60,61,5,4,0,0,
        61,9,1,0,0,0,62,63,5,19,0,0,63,11,1,0,0,0,64,65,5,20,0,0,65,66,5,
        3,0,0,66,67,3,14,7,0,67,68,5,4,0,0,68,13,1,0,0,0,69,71,3,16,8,0,
        70,69,1,0,0,0,71,74,1,0,0,0,72,70,1,0,0,0,72,73,1,0,0,0,73,75,1,
        0,0,0,74,72,1,0,0,0,75,76,5,13,0,0,76,77,5,17,0,0,77,78,5,14,0,0,
        78,15,1,0,0,0,79,80,5,16,0,0,80,81,5,15,0,0,81,82,5,10,0,0,82,17,
        1,0,0,0,3,49,58,72
    ]

class shaderlangParser ( Parser ):

    grammarFileName = "shaderlang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'Shader'", "'\"'", "'{'", "'}'", "'Properties'", 
                     "'('", "','", "')'", "'='", "';'", "'Subshader'", "'Pass'", 
                     "'GLSLBEGIN'", "'GLSLEND'", "<INVALID>", "'vec3'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "VARNAME", 
                      "TYPE", "PROGSTR", "INITVALUE", "WS", "STAGENAME" ]

    RULE_prog = 0
    RULE_properties = 1
    RULE_property = 2
    RULE_subshader = 3
    RULE_pass = 4
    RULE_config = 5
    RULE_stage = 6
    RULE_gpulang = 7
    RULE_refuniform = 8

    ruleNames =  [ "prog", "properties", "property", "subshader", "pass", 
                   "config", "stage", "gpulang", "refuniform" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    VARNAME=15
    TYPE=16
    PROGSTR=17
    INITVALUE=18
    WS=19
    STAGENAME=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_prog

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class StructContext(ProgContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.ProgContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VARNAME(self):
            return self.getToken(shaderlangParser.VARNAME, 0)
        def properties(self):
            return self.getTypedRuleContext(shaderlangParser.PropertiesContext,0)

        def subshader(self):
            return self.getTypedRuleContext(shaderlangParser.SubshaderContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStruct" ):
                listener.enterStruct(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStruct" ):
                listener.exitStruct(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStruct" ):
                return visitor.visitStruct(self)
            else:
                return visitor.visitChildren(self)



    def prog(self):

        localctx = shaderlangParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        try:
            localctx = shaderlangParser.StructContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(shaderlangParser.T__0)
            self.state = 19
            self.match(shaderlangParser.T__1)
            self.state = 20
            self.match(shaderlangParser.VARNAME)
            self.state = 21
            self.match(shaderlangParser.T__1)
            self.state = 22
            self.match(shaderlangParser.T__2)
            self.state = 23
            self.properties()
            self.state = 24
            self.subshader()
            self.state = 25
            self.match(shaderlangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PropertiesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_properties

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PropertiesexpContext(PropertiesContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.PropertiesContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def property_(self):
            return self.getTypedRuleContext(shaderlangParser.PropertyContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPropertiesexp" ):
                listener.enterPropertiesexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPropertiesexp" ):
                listener.exitPropertiesexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPropertiesexp" ):
                return visitor.visitPropertiesexp(self)
            else:
                return visitor.visitChildren(self)



    def properties(self):

        localctx = shaderlangParser.PropertiesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_properties)
        try:
            localctx = shaderlangParser.PropertiesexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(shaderlangParser.T__4)
            self.state = 28
            self.match(shaderlangParser.T__2)
            self.state = 29
            self.property_()
            self.state = 30
            self.match(shaderlangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_property

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PropertyexpContext(PropertyContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.PropertyContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VARNAME(self, i:int=None):
            if i is None:
                return self.getTokens(shaderlangParser.VARNAME)
            else:
                return self.getToken(shaderlangParser.VARNAME, i)
        def TYPE(self):
            return self.getToken(shaderlangParser.TYPE, 0)
        def INITVALUE(self):
            return self.getToken(shaderlangParser.INITVALUE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPropertyexp" ):
                listener.enterPropertyexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPropertyexp" ):
                listener.exitPropertyexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPropertyexp" ):
                return visitor.visitPropertyexp(self)
            else:
                return visitor.visitChildren(self)



    def property_(self):

        localctx = shaderlangParser.PropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_property)
        try:
            localctx = shaderlangParser.PropertyexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(shaderlangParser.VARNAME)
            self.state = 33
            self.match(shaderlangParser.T__5)
            self.state = 34
            self.match(shaderlangParser.T__1)
            self.state = 35
            self.match(shaderlangParser.VARNAME)
            self.state = 36
            self.match(shaderlangParser.T__1)
            self.state = 37
            self.match(shaderlangParser.T__6)
            self.state = 38
            self.match(shaderlangParser.TYPE)
            self.state = 39
            self.match(shaderlangParser.T__7)
            self.state = 40
            self.match(shaderlangParser.T__8)
            self.state = 41
            self.match(shaderlangParser.INITVALUE)
            self.state = 42
            self.match(shaderlangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SubshaderContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_subshader

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class SubshaderexpContext(SubshaderContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.SubshaderContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def pass_(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(shaderlangParser.PassContext)
            else:
                return self.getTypedRuleContext(shaderlangParser.PassContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubshaderexp" ):
                listener.enterSubshaderexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubshaderexp" ):
                listener.exitSubshaderexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubshaderexp" ):
                return visitor.visitSubshaderexp(self)
            else:
                return visitor.visitChildren(self)



    def subshader(self):

        localctx = shaderlangParser.SubshaderContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_subshader)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.SubshaderexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(shaderlangParser.T__10)
            self.state = 45
            self.match(shaderlangParser.T__2)
            self.state = 47 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 46
                self.pass_()
                self.state = 49 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==shaderlangParser.T__11):
                    break

            self.state = 51
            self.match(shaderlangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PassContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_pass

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class PassexpContext(PassContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.PassContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def stage(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(shaderlangParser.StageContext)
            else:
                return self.getTypedRuleContext(shaderlangParser.StageContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPassexp" ):
                listener.enterPassexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPassexp" ):
                listener.exitPassexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPassexp" ):
                return visitor.visitPassexp(self)
            else:
                return visitor.visitChildren(self)



    def pass_(self):

        localctx = shaderlangParser.PassContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_pass)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.PassexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(shaderlangParser.T__11)
            self.state = 54
            self.match(shaderlangParser.T__2)
            self.state = 56 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 55
                self.stage()
                self.state = 58 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==shaderlangParser.STAGENAME):
                    break

            self.state = 60
            self.match(shaderlangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConfigContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WS(self):
            return self.getToken(shaderlangParser.WS, 0)

        def getRuleIndex(self):
            return shaderlangParser.RULE_config

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConfig" ):
                listener.enterConfig(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConfig" ):
                listener.exitConfig(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConfig" ):
                return visitor.visitConfig(self)
            else:
                return visitor.visitChildren(self)




    def config(self):

        localctx = shaderlangParser.ConfigContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_config)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.match(shaderlangParser.WS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StageContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_stage

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class StageexpContext(StageContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.StageContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STAGENAME(self):
            return self.getToken(shaderlangParser.STAGENAME, 0)
        def gpulang(self):
            return self.getTypedRuleContext(shaderlangParser.GpulangContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStageexp" ):
                listener.enterStageexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStageexp" ):
                listener.exitStageexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStageexp" ):
                return visitor.visitStageexp(self)
            else:
                return visitor.visitChildren(self)



    def stage(self):

        localctx = shaderlangParser.StageContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_stage)
        try:
            localctx = shaderlangParser.StageexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(shaderlangParser.STAGENAME)
            self.state = 65
            self.match(shaderlangParser.T__2)
            self.state = 66
            self.gpulang()
            self.state = 67
            self.match(shaderlangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GpulangContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_gpulang

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class GpulangexpContext(GpulangContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.GpulangContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def PROGSTR(self):
            return self.getToken(shaderlangParser.PROGSTR, 0)
        def refuniform(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(shaderlangParser.RefuniformContext)
            else:
                return self.getTypedRuleContext(shaderlangParser.RefuniformContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGpulangexp" ):
                listener.enterGpulangexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGpulangexp" ):
                listener.exitGpulangexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitGpulangexp" ):
                return visitor.visitGpulangexp(self)
            else:
                return visitor.visitChildren(self)



    def gpulang(self):

        localctx = shaderlangParser.GpulangContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_gpulang)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.GpulangexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==shaderlangParser.TYPE:
                self.state = 69
                self.refuniform()
                self.state = 74
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 75
            self.match(shaderlangParser.T__12)
            self.state = 76
            self.match(shaderlangParser.PROGSTR)
            self.state = 77
            self.match(shaderlangParser.T__13)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RefuniformContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_refuniform

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class RefuniformexpContext(RefuniformContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.RefuniformContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def TYPE(self):
            return self.getToken(shaderlangParser.TYPE, 0)
        def VARNAME(self):
            return self.getToken(shaderlangParser.VARNAME, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRefuniformexp" ):
                listener.enterRefuniformexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRefuniformexp" ):
                listener.exitRefuniformexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRefuniformexp" ):
                return visitor.visitRefuniformexp(self)
            else:
                return visitor.visitChildren(self)



    def refuniform(self):

        localctx = shaderlangParser.RefuniformContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_refuniform)
        try:
            localctx = shaderlangParser.RefuniformexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            self.match(shaderlangParser.TYPE)
            self.state = 80
            self.match(shaderlangParser.VARNAME)
            self.state = 81
            self.match(shaderlangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





