cmake_minimum_required(VERSION 3.2)
project(shaderlangcompiler)
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_FLAGS_DEBUG "/MTd")
set(Java11 D:/tools/JAVA11/bin/java)
set(Java11bin D:/tools/JAVA11/bin)
set(antlr4_jar ${CMAKE_CURRENT_SOURCE_DIR}/thirdparty/antlr4/javajar/antlr.jar)
set(antlr4_inc ${CMAKE_CURRENT_SOURCE_DIR}/thirdparty/antlr4/runtime/runtime/antlr4)
set(antlr4_bin ${CMAKE_CURRENT_SOURCE_DIR}/thirdparty/antlr4/dist/Debug)
set(antlr4_lib antlr4-runtime-static.lib)

file(GLOB g4list ${CMAKE_CURRENT_SOURCE_DIR}/g4/*.g4)

foreach(g4file IN LISTS g4list)
get_filename_component(FILENAME ${g4file} NAME)
add_custom_command(
    OUTPUT CppGenfile
    COMMAND
    ${Java11} -jar ${antlr4_jar} -Dlanguage=Cpp ${CMAKE_CURRENT_SOURCE_DIR}/g4/${FILENAME} -o ${CMAKE_CURRENT_SOURCE_DIR}/src
    DEPENDS ${g4file} ${g4list}
    
    COMMENT "ANTLR4 compiling -cpp ${FILENAME} ................."

)
# add_custom_command(
#     OUTPUT JavaGenfile
#     COMMAND
#     ${Java11} -jar ${antlr4_jar} -Dlanguage=Java ${CMAKE_CURRENT_SOURCE_DIR}/g4/${FILENAME} -o ${CMAKE_CURRENT_SOURCE_DIR}
#     DEPENDS ${g4file} ${g4list}
#     COMMAND 
#     ${Java11Path}/javac *.java
#     COMMENT "ANTLR4 compiling -java ${FILENAME} ................."

# )
# list(APPEND SPV_SHADERS ${SHADER_BINARY_DIR}/${FILENAME}.spv)
endforeach()
add_custom_target(CompilerCPP ALL DEPENDS CppGenfile )
file(GLOB antlr4_gen ./src/*.cpp)
add_executable(shaderlangcompiler ./src/main.cpp ${antlr4_gen})
target_include_directories(shaderlangcompiler PRIVATE ${antlr4_inc} ./include ./src)
target_link_directories(shaderlangcompiler PRIVATE ${antlr4_bin} )
target_link_libraries(shaderlangcompiler ${antlr4_lib})