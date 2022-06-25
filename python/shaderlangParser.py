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
        4,1,21,102,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
        1,1,1,1,1,5,1,33,8,1,10,1,12,1,36,9,1,1,1,1,1,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,5,3,57,8,3,10,
        3,12,3,60,9,3,1,3,1,3,1,4,1,4,1,4,4,4,67,8,4,11,4,12,4,68,1,4,1,
        4,1,5,1,5,1,5,4,5,76,8,5,11,5,12,5,77,1,5,1,5,1,6,1,6,1,7,1,7,1,
        7,1,7,1,7,1,8,5,8,90,8,8,10,8,12,8,93,9,8,1,8,1,8,1,9,1,9,1,9,1,
        9,1,9,1,9,0,0,10,0,2,4,6,8,10,12,14,16,18,0,0,96,0,20,1,0,0,0,2,
        29,1,0,0,0,4,39,1,0,0,0,6,51,1,0,0,0,8,63,1,0,0,0,10,72,1,0,0,0,
        12,81,1,0,0,0,14,83,1,0,0,0,16,91,1,0,0,0,18,96,1,0,0,0,20,21,5,
        1,0,0,21,22,5,2,0,0,22,23,5,17,0,0,23,24,5,2,0,0,24,25,5,3,0,0,25,
        26,3,2,1,0,26,27,3,8,4,0,27,28,5,4,0,0,28,1,1,0,0,0,29,30,5,5,0,
        0,30,34,5,3,0,0,31,33,3,4,2,0,32,31,1,0,0,0,33,36,1,0,0,0,34,32,
        1,0,0,0,34,35,1,0,0,0,35,37,1,0,0,0,36,34,1,0,0,0,37,38,5,4,0,0,
        38,3,1,0,0,0,39,40,5,18,0,0,40,41,5,6,0,0,41,42,5,2,0,0,42,43,5,
        18,0,0,43,44,5,2,0,0,44,45,5,7,0,0,45,46,5,16,0,0,46,47,5,8,0,0,
        47,48,5,9,0,0,48,49,3,6,3,0,49,50,5,10,0,0,50,5,1,0,0,0,51,52,5,
        16,0,0,52,53,5,6,0,0,53,58,5,19,0,0,54,55,5,7,0,0,55,57,5,19,0,0,
        56,54,1,0,0,0,57,60,1,0,0,0,58,56,1,0,0,0,58,59,1,0,0,0,59,61,1,
        0,0,0,60,58,1,0,0,0,61,62,5,8,0,0,62,7,1,0,0,0,63,64,5,11,0,0,64,
        66,5,3,0,0,65,67,3,10,5,0,66,65,1,0,0,0,67,68,1,0,0,0,68,66,1,0,
        0,0,68,69,1,0,0,0,69,70,1,0,0,0,70,71,5,4,0,0,71,9,1,0,0,0,72,73,
        5,12,0,0,73,75,5,3,0,0,74,76,3,14,7,0,75,74,1,0,0,0,76,77,1,0,0,
        0,77,75,1,0,0,0,77,78,1,0,0,0,78,79,1,0,0,0,79,80,5,4,0,0,80,11,
        1,0,0,0,81,82,5,21,0,0,82,13,1,0,0,0,83,84,5,15,0,0,84,85,5,3,0,
        0,85,86,3,16,8,0,86,87,5,4,0,0,87,15,1,0,0,0,88,90,3,18,9,0,89,88,
        1,0,0,0,90,93,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,94,1,0,0,0,
        93,91,1,0,0,0,94,95,5,14,0,0,95,17,1,0,0,0,96,97,5,13,0,0,97,98,
        5,16,0,0,98,99,5,18,0,0,99,100,5,10,0,0,100,19,1,0,0,0,5,34,58,68,
        77,91
    ]

class shaderlangParser ( Parser ):

    grammarFileName = "shaderlang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'Shader'", "'\"'", "'{'", "'}'", "'Properties'", 
                     "'('", "','", "')'", "'='", "';'", "'Subshader'", "'Pass'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "DIRECTION", "PROGSTR", "STAGENAME", 
                      "TYPE", "SHADERNAME", "VARNAME", "NUMBER", "INITVALUE", 
                      "WS" ]

    RULE_prog = 0
    RULE_properties = 1
    RULE_property = 2
    RULE_initvalue = 3
    RULE_subshader = 4
    RULE_pass = 5
    RULE_config = 6
    RULE_stage = 7
    RULE_gpulang = 8
    RULE_refuniform = 9

    ruleNames =  [ "prog", "properties", "property", "initvalue", "subshader", 
                   "pass", "config", "stage", "gpulang", "refuniform" ]

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
    DIRECTION=13
    PROGSTR=14
    STAGENAME=15
    TYPE=16
    SHADERNAME=17
    VARNAME=18
    NUMBER=19
    INITVALUE=20
    WS=21

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

        def SHADERNAME(self):
            return self.getToken(shaderlangParser.SHADERNAME, 0)
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
            self.state = 20
            self.match(shaderlangParser.T__0)
            self.state = 21
            self.match(shaderlangParser.T__1)
            self.state = 22
            self.match(shaderlangParser.SHADERNAME)
            self.state = 23
            self.match(shaderlangParser.T__1)
            self.state = 24
            self.match(shaderlangParser.T__2)
            self.state = 25
            self.properties()
            self.state = 26
            self.subshader()
            self.state = 27
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

        def property_(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(shaderlangParser.PropertyContext)
            else:
                return self.getTypedRuleContext(shaderlangParser.PropertyContext,i)


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
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.PropertiesexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(shaderlangParser.T__4)
            self.state = 30
            self.match(shaderlangParser.T__2)
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==shaderlangParser.VARNAME:
                self.state = 31
                self.property_()
                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 37
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
        def initvalue(self):
            return self.getTypedRuleContext(shaderlangParser.InitvalueContext,0)


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
            self.state = 39
            self.match(shaderlangParser.VARNAME)
            self.state = 40
            self.match(shaderlangParser.T__5)
            self.state = 41
            self.match(shaderlangParser.T__1)
            self.state = 42
            self.match(shaderlangParser.VARNAME)
            self.state = 43
            self.match(shaderlangParser.T__1)
            self.state = 44
            self.match(shaderlangParser.T__6)
            self.state = 45
            self.match(shaderlangParser.TYPE)
            self.state = 46
            self.match(shaderlangParser.T__7)
            self.state = 47
            self.match(shaderlangParser.T__8)
            self.state = 48
            self.initvalue()
            self.state = 49
            self.match(shaderlangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InitvalueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return shaderlangParser.RULE_initvalue

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class InitvaluexpContext(InitvalueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a shaderlangParser.InitvalueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def TYPE(self):
            return self.getToken(shaderlangParser.TYPE, 0)
        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(shaderlangParser.NUMBER)
            else:
                return self.getToken(shaderlangParser.NUMBER, i)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInitvaluexp" ):
                listener.enterInitvaluexp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInitvaluexp" ):
                listener.exitInitvaluexp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInitvaluexp" ):
                return visitor.visitInitvaluexp(self)
            else:
                return visitor.visitChildren(self)



    def initvalue(self):

        localctx = shaderlangParser.InitvalueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_initvalue)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.InitvaluexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(shaderlangParser.TYPE)
            self.state = 52
            self.match(shaderlangParser.T__5)
            self.state = 53
            self.match(shaderlangParser.NUMBER)
            self.state = 58
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==shaderlangParser.T__6:
                self.state = 54
                self.match(shaderlangParser.T__6)
                self.state = 55
                self.match(shaderlangParser.NUMBER)
                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 61
            self.match(shaderlangParser.T__7)
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
        self.enterRule(localctx, 8, self.RULE_subshader)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.SubshaderexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(shaderlangParser.T__10)
            self.state = 64
            self.match(shaderlangParser.T__2)
            self.state = 66 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 65
                self.pass_()
                self.state = 68 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==shaderlangParser.T__11):
                    break

            self.state = 70
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
        self.enterRule(localctx, 10, self.RULE_pass)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.PassexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(shaderlangParser.T__11)
            self.state = 73
            self.match(shaderlangParser.T__2)
            self.state = 75 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 74
                self.stage()
                self.state = 77 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==shaderlangParser.STAGENAME):
                    break

            self.state = 79
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
        self.enterRule(localctx, 12, self.RULE_config)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
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
        self.enterRule(localctx, 14, self.RULE_stage)
        try:
            localctx = shaderlangParser.StageexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(shaderlangParser.STAGENAME)
            self.state = 84
            self.match(shaderlangParser.T__2)
            self.state = 85
            self.gpulang()
            self.state = 86
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
        self.enterRule(localctx, 16, self.RULE_gpulang)
        self._la = 0 # Token type
        try:
            localctx = shaderlangParser.GpulangexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==shaderlangParser.DIRECTION:
                self.state = 88
                self.refuniform()
                self.state = 93
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 94
            self.match(shaderlangParser.PROGSTR)
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

        def DIRECTION(self):
            return self.getToken(shaderlangParser.DIRECTION, 0)
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
        self.enterRule(localctx, 18, self.RULE_refuniform)
        try:
            localctx = shaderlangParser.RefuniformexpContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 96
            self.match(shaderlangParser.DIRECTION)
            self.state = 97
            self.match(shaderlangParser.TYPE)
            self.state = 98
            self.match(shaderlangParser.VARNAME)
            self.state = 99
            self.match(shaderlangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





