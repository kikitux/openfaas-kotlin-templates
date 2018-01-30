package handler

class Handler{

    private val greeting = "Hello from kotlin native"

    fun handler(args: String?) {
        println(greeting + " " + args)
    }


}
