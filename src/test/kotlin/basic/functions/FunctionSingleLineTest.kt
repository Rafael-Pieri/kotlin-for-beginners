package basic.functions

import org.junit.Assert.assertEquals
import org.junit.Test

class FunctionSingleLineTest {

    @Test
    fun shouldReturnWordInUppercase() {
        assertEquals("WORD", toUpper("word"))
    }

    @Test
    fun shouldReturnPositionValue() {
        assertEquals('r', getPositionValue("word", 3))
    }

    @Test(expected = StringIndexOutOfBoundsException::class)
    fun shouldThrowException() {
        getPositionValue("word", 15)
    }

    @Test
    fun shouldSumTheProvidedValues() {
        assertEquals(22, sum(1, 3, 6, 12))
    }
}