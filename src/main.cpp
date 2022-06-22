#include <iostream>

#include "antlr4-runtime.h"
#include "shaderlangParser.h"
#pragma execution_character_set("utf-8")


// using namespace antlr4;

int main(int argc, const char * argv[]) {

    auto test=shaderlangParser(nullptr);
    printf("end");

  return 0;
}