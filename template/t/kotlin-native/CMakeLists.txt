cmake_minimum_required(VERSION 3.5)

include(function/CMakeLists.txt)

project(kotlin_native Kotlin)

konanc_executable(
        NAME Main
        SOURCES main.kt function/src/handler.kt
)
