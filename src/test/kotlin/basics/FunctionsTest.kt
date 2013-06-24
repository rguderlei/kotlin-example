package basics

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.CoreMatchers.equalTo

Test
class FunctionsTest{
    fun testExecute(){
        val a :Int = 1
        val b :Int = 1

       // assertThat(execute(a,b, { add } ), equalTo(add(a,b)))      // does not work, first class functions are not available see KT-1183
        assertThat(execute(a,b, {(a,b) -> (a+b)}), equalTo(add(a,b)))
    }
}