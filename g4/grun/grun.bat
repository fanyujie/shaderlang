set Java11=D:/tools/JAVA11/bin
set antlr4_jar=D:/Grocery/hw/homebrew/tyengine/thirdparty/antlr4/javajar/antlr.jar
echo %Java11%
%Java11%/java -jar %antlr4_jar% -visitor ../shaderlang.g4 -o ./

%Java11%/javac -cp %antlr4_jar% ./*.java
@REM %Java11%/javac -cp %antlr4_jar% -sourcepath ./tyshaderlang/*.java 
%Java11%/java -cp .;%antlr4_jar% org.antlr.v4.gui.TestRig shaderlang prog D:\Grocery\hw\homebrew\shaderlang\test\test.ghshader -gui
 
pause
@REM ./g4/TyShadercompilertest.txt