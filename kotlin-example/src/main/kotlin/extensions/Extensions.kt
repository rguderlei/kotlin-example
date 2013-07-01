package extensions

fun String.rot13(): String {
    val builder = StringBuilder()
    for(c in this)
        builder.append(
                when(c){
                    in 'a'..'m' -> (c.toInt() + 13).toChar()
                    in 'A'..'m' -> (c.toInt() + 13).toChar()
                    in 'n'..'z' -> (c.toInt() - 13).toChar()
                    in 'N'..'Z' -> (c.toInt() - 13).toChar()
                    else -> c
                })
    return builder.toString()
}