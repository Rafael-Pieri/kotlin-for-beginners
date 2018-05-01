package basic.flow

import org.junit.Assert.assertEquals
import org.junit.Test

class LoopTest {

    private val expectedAscendingOrderList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    private val expectedDescendingOrderList: MutableList<Int> = mutableListOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

    @Test
    fun shouldReturnListOfValuesUsingForCommand() {
        assertEquals(this.expectedAscendingOrderList, loopUsingFor())
    }

    @Test
    fun shouldReturnListOfValuesUsingForAndStepCommand() {
        assertEquals(this.expectedDescendingOrderList, loopUsingForAndStepCommand())
    }

    @Test
    fun shouldReturnListOfValuesUsingWhileCommand() {
        assertEquals(this.expectedAscendingOrderList, loopUsingWhile())
    }

    @Test
    fun shouldReturnListOfValuesUsingDoWhileCommand() {
        assertEquals(this.expectedAscendingOrderList, loopUsingDoWhile())
    }
}