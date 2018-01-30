import handler.Handler
import kotlinx.cinterop.*
import platform.posix.*
import platform.posix.size_t

fun main(args: Array<String>) {

    val filename = "/dev/stdin"

    val file = fopen(filename, "r")
    if (file == null) {
        perror("cannot open input file $filename")
        return
    }

    try {
        memScoped {
            val bufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(bufferLength)
            val input = fgets(buffer, bufferLength, file)?.toKString()

            if ( ! input.isNullOrEmpty() ){
                val handler = Handler()
                handler.handler(input) // String?
            }
        }
    } finally {
        fclose(file)
    }
}
