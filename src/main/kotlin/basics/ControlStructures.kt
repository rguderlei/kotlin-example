package basics

fun ifReturningValue(number: Int) : String {
    val result = if(number %2 == 0) "Even" else "Odd"
    return result
}
