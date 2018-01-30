package handler

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString

class Handler{

    private val greeting = "Hello from kotlin native"

    fun handler(input: List<String>) {

        val args = input

        println("Hello from Kotlin, this is what we got")
        args.onEach {
            print(it)
        }
    }
}
