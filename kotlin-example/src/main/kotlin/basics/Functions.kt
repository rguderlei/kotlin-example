package basics

// function definition
fun add(a: Int, b: Int) : Int {
    return a + b;
}

// function definition: return type is inferred
fun add_inferred (a: Int, b:Int) = a + b

// function literal as parameter
fun execute(a: Int, b:Int, f: (Int,Int) -> Int) = f(a,b)