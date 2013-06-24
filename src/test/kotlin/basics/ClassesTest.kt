package basics

import org.junit.Test
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import junit.framework.TestCase

Test
class ClassesTest :TestCase() {

   fun testClassCreationAndProperties() : Unit{
       val c = ClassWithProperties()
       assertThat(c.foo, `is`(equalTo(0)))
       c.foo = 10
       assertThat(c.foo, `is`(equalTo(10)))
       assertThat(c.f(), equalTo("10"))
   }

   fun testImmutableClass() : Unit{
       val c = ImmutableClass(1)
       assertThat(c.foo, `is`(equalTo(1)))
       // c.foo = 5 // compile error
   }

   fun testInheritance() :Unit {
      val c = ExtendedClassWithProperties()
       c.bar = "foo"
       assertThat(c.f(), equalTo("0, foo"))
   }


}