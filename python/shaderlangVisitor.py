# Generated from ../g4/shaderlang.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .shaderlangParser import shaderlangParser
else:
    from shaderlangParser import shaderlangParser

# This class defines a complete generic visitor for a parse tree produced by shaderlangParser.

class shaderlangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by shaderlangParser#struct.
    def visitStruct(self, ctx:shaderlangParser.StructContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#propertiesexp.
    def visitPropertiesexp(self, ctx:shaderlangParser.PropertiesexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#propertyexp.
    def visitPropertyexp(self, ctx:shaderlangParser.PropertyexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#subshaderexp.
    def visitSubshaderexp(self, ctx:shaderlangParser.SubshaderexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#passexp.
    def visitPassexp(self, ctx:shaderlangParser.PassexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#config.
    def visitConfig(self, ctx:shaderlangParser.ConfigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#stageexp.
    def visitStageexp(self, ctx:shaderlangParser.StageexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#gpulangexp.
    def visitGpulangexp(self, ctx:shaderlangParser.GpulangexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by shaderlangParser#refuniformexp.
    def visitRefuniformexp(self, ctx:shaderlangParser.RefuniformexpContext):
        return self.visitChildren(ctx)



del shaderlangParser