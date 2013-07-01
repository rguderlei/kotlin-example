package basics

import junit.framework.TestCase
import org.junit.Assert.assertEquals


class ControllStructuresTest : TestCase() {
    fun testIfReturningValue() : Unit {
        assertEquals(ifReturningValue(42), "Even")
        assertEquals(ifReturningValue(41), "Odd")
    }

}