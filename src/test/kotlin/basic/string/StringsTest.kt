package basic.string

import org.junit.Assert.assertEquals
import org.junit.Test

class StringsTest {

    @Test
    fun shouldRemoveTheFirstLetter() {
        val string = removePrefix("parallel", "p")
        assertEquals("arallel", string)
    }

    @Test
    fun shouldReturnTheWordInUppercase() {
        val string = "word".toUpperCase()
        assertEquals("WORD", string)
    }

    @Test
    fun shouldGetTheRLetter() {
        val string = getPositionValue("word", 3)
        assertEquals('r', string)
    }

    @Test
    fun shouldRemoveProvidedRange() {
        val string = removeRange("accomplishment", 4, 8)
        assertEquals("accoshment", string)
    }

    @Test
    fun shouldJoinTheTwoStrings() {
        val string = plusValue("accomplishment", " completed")
        assertEquals("accomplishment completed", string)
    }

    @Test
    fun shouldCapitalizeTheWord() {
        val string = "word".capitalize()
        assertEquals("Word", string)
    }

    @Test
    fun shouldDecapitalizeTheWord() {
        val string = "WORD".decapitalize()
        assertEquals("wORD", string)
    }
}