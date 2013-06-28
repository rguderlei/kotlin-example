package nullsafety

class Nullsafety(var a : String, var b:String?)  {

    fun lengthA(): Int {
        return a.length()
    }

    fun lengthB() : Int? {
        return b?.length()
    }

    fun nonnullLengthB(): Int {
        return b?.length() ?: 0;
    }

    fun npeLengthB(): Int {
        return b!!.length()
    }
}