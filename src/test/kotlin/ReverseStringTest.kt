import basic.reverseUsingLoop
import basic.reverseUsingSB
import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseStringTest {

    @Test
    private fun reverseUsingSB() {
        assertEquals("bs niltok", reverseUsingSB("kotlin sb"))
    }

    @Test
    private fun reverseUsingLoop() {
        assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }
}