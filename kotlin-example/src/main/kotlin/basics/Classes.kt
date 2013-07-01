package basics

open class ClassWithProperties {    // make class derivable
    var foo: Int = 0
    open fun f() : String { return foo.toString()}
}

class ImmutableClass (val foo: Int)

class ExtendedClassWithProperties : ClassWithProperties() {
    var bar: String  = ""
    override fun f():String {
       return "${foo}, ${bar}"
    }
}