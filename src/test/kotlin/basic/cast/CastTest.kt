package basic.cast

import org.junit.Assert.assertEquals
import org.junit.Test
import java.lang.NumberFormatException

class CastTest {

    @Test
    fun shouldConvertIntToString() {
        assertEquals("127", convertIntToString(127))
    }

    @Test
    fun shouldConvertStringToInt() {
        assertEquals(236, convertStringToInt("236"))
    }

    @Test
    fun shouldConvertLongToInt() {
        val longNumber: Long = 89
        assertEquals(89, convertLongToInt(longNumber))
    }

    @Test(expected = NumberFormatException::class)
    fun shouldConvertStringToIntShouldRaiseAnException() {
        convertStringToInt("a5k8j")
    }
}