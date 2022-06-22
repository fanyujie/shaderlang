set Java11bin=D:/tools/JAVA11/bin
set antlr4_jar=../thirdparty/antlr4/javajar/antlr.jar
%Java11bin%/java -jar %antlr4_jar% -Dlanguage=Python3 ../g4/shaderlang.g4 -o ../python
pause