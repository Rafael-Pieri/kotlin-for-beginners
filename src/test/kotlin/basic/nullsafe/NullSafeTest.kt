package basic.nullsafe

import org.junit.Assert.*
import org.junit.Test

class NullSafeTest {

    @Test
    fun shouldCallNullSafeString() {
        assertEquals(true, nullSafeString())
    }

    @Test
    fun shouldNotReturnANullExampleJavaInstance() {
        val lengthNameByGetInstance = getNullExampleJavaInstance()
        assertNull(lengthNameByGetInstance)
    }

    @Test
    fun shouldReturnANullExampleJavaInstanceButNoValuesInItsAttributes() {
        val lengthNameByConstructor = getNullExampleJavaByConstructor()
        assertNotNull(lengthNameByConstructor)
        assertEquals(0, lengthNameByConstructor.age)
        assertNull(lengthNameByConstructor.name)
    }

    @Test
    fun shouldReturnFourWithSafeCallOperator() {
        assertEquals(4, getStringLengthWithSafeCallOperator("word"))
    }

    @Test
    fun shouldReturnNullWithSafeCallOperator() {
        assertEquals(null, getStringLengthWithSafeCallOperator(null))
    }

    @Test
    fun shouldReturnFourWithoutSafeCallOperator() {
        assertEquals(4, getStringLengthWithoutSafeCallOperator("word"))
    }

    @Test(expected = NullPointerException::class)
    fun shouldRaiseAnExceptionWithoutSafeCallOperator() {
        getStringLengthWithoutSafeCallOperator(null)
    }
}