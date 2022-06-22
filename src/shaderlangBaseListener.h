
// Generated from D:/Grocery/hw/homebrew/shaderlang/g4/shaderlang.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "shaderlangListener.h"


/**
 * This class provides an empty implementation of shaderlangListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  shaderlangBaseListener : public shaderlangListener {
public:

  virtual void enterProg(shaderlangParser::ProgContext * /*ctx*/) override { }
  virtual void exitProg(shaderlangParser::ProgContext * /*ctx*/) override { }

  virtual void enterExpr(shaderlangParser::ExprContext * /*ctx*/) override { }
  virtual void exitExpr(shaderlangParser::ExprContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

