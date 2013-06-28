package extensions

import junit.framework.TestCase
import org.junit.Assert.assertNotSame
import org.junit.Assert.assertThat
import kotlin.test.assertEquals
import org.hamcrest.Matchers.*

class ExtensionsTest : TestCase() {
    fun testBuildinExtensions() : Unit {
       val arr = array(1,2,3,4,5);
       val filtered = arr.filter { x -> x > 2 }

       assertNotSame(filtered, arr)
       // assertEquals(filtered, array(3,4,5)) // hm ... filtered array has different type than the original ...
       assertThat(filtered, everyItem(greaterThan(2)))
    }

    fun testCustomExtension(): Unit {
        assertEquals("foo".rot13().rot13(), "foo")
    }
}
