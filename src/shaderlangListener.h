
// Generated from D:/Grocery/hw/homebrew/shaderlang/g4/shaderlang.g4 by ANTLR 4.10.1

#pragma once


#include "antlr4-runtime.h"
#include "shaderlangParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by shaderlangParser.
 */
class  shaderlangListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterProg(shaderlangParser::ProgContext *ctx) = 0;
  virtual void exitProg(shaderlangParser::ProgContext *ctx) = 0;

  virtual void enterExpr(shaderlangParser::ExprContext *ctx) = 0;
  virtual void exitExpr(shaderlangParser::ExprContext *ctx) = 0;


};

