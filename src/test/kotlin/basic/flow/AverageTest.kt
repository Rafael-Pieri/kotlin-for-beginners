package basic.flow

import org.junit.Assert.assertEquals
import org.junit.Test

class AverageTest {

    @Test
    fun shouldReturnIGotApproved() {
        assertEquals("I got approved!", myResults(7, 8, 7, 9, 4))
    }

    @Test
    fun shouldReturnIGotApprovedWithAboveAverageScore() {
        assertEquals("I got approved with above average score!", myResults(6, 8, 10, 9, 10))
    }

    @Test
    fun shouldReturnIdidNotApproved() {
        assertEquals("I did not approved!", myResults(6, 3, 7, 4, 7))
    }

    @Test
    fun shouldReturnIGotApprovedWithExcellence() {
        assertEquals("I got approved with excellence!", myResults(5, 10, 10, 10, 10))
    }
}