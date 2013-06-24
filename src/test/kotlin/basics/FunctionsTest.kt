package basics

import org.junit.Assert.assertThat
import org.hamcrest.CoreMatchers.equalTo
import junit.framework.TestCase

class FunctionsTest : TestCase(){
    fun testExecute() : Unit{
        val a :Int = 1
        val b :Int = 1

        assertThat(execute(a,b, ::add  ), equalTo(add_inferred(a,b)))  // pass a function
        assertThat(execute(a,b, {(a,b) -> (a+b)}), equalTo(add(a,b)))  // pass a function literal
    }
}