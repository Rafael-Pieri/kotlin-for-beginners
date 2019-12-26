package basic.nullsafe

import org.junit.Assert.assertEquals
import org.junit.Test

class NullSafeTest {

    @Test
    fun shouldCallNullSafeString() {
        assertEquals(true, nullSafeString())
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