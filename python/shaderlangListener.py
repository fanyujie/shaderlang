# Generated from ../g4/shaderlang.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .shaderlangParser import shaderlangParser
else:
    from shaderlangParser import shaderlangParser

# This class defines a complete listener for a parse tree produced by shaderlangParser.
class shaderlangListener(ParseTreeListener):

    # Enter a parse tree produced by shaderlangParser#prog.
    def enterProg(self, ctx:shaderlangParser.ProgContext):
        pass

    # Exit a parse tree produced by shaderlangParser#prog.
    def exitProg(self, ctx:shaderlangParser.ProgContext):
        pass


    # Enter a parse tree produced by shaderlangParser#expr.
    def enterExpr(self, ctx:shaderlangParser.ExprContext):
        pass

    # Exit a parse tree produced by shaderlangParser#expr.
    def exitExpr(self, ctx:shaderlangParser.ExprContext):
        pass



del shaderlangParser