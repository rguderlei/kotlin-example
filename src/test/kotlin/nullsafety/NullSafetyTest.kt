package nullsafety

import junit.framework.TestCase
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.fail

class NullsafetyTest : TestCase() {

    fun testInstatiationWithNullableProperty() : Unit {
        val ns = Nullsafety("",null);
        assertEquals(ns.lengthA(), 0)
        assertEquals(ns.nonnullLengthB(), 0)
        assertNull(ns.lengthB())

        //val ns2 = Nullsafety(null, "");     // compile error
    }

    fun testInstatiationWithNPE() : Unit {
        val ns = Nullsafety("",null);
        try {
            ns.npeLengthB()
            fail()
        } catch (e: NullPointerException){

        }

        //val ns2 = Nullsafety(null, "");     // compile error
    }

}