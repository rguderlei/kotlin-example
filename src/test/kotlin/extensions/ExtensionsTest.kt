package extensions

import junit.framework.TestCase
import org.junit.Assert.assertNotSame
import org.junit.Assert.assertThat
import kotlin.test.assertEquals
import org.hamcrest.Matchers.*


/**
 * Created with IntelliJ IDEA.
 * User: rguderlei
 * Date: 25.06.13
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */

class ExtensionsTest : TestCase() {
    fun testBuildinExtensions() : Unit {
       val arr = array(1,2,3,4,5);
       val filtered = arr.filter { x -> x > 2 }

       assertNotSame(filtered, arr)
       // assertEquals(filtered, array(3,4,5)) // hm ... filtered array has different type than the original ...
       assertThat(filtered, everyItem(greaterThan(2)))
    }
}
