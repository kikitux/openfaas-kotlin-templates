cmake_minimum_required(VERSION 3.5)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(function Kotlin)

cinterop(
        NAME sample
        DEF_FILE ${CMAKE_CURRENT_LIST_DIR}/src/c_interop/sample.def
        COMPILER_OPTS "-I ${CURL_INCLUDE_DIR}"
)

