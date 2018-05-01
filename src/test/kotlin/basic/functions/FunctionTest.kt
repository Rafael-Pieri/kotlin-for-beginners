package basic.functions

import org.junit.Assert.assertEquals
import org.junit.Test

class FunctionTest {

    @Test
    fun shouldReturnLeafColorPurpleAndCurrentHeigthTwoPointFive() {
        val tree = Tree("Purple", 2.5f)
        assertEquals("Tree(leafColor='Purple', currentHeight=2.5)", tree.toString())
    }

    @Test
    fun shouldReturnLeafColorGreenAndCurrentHeigthZeroPointFive() {
        val tree = Tree(currentHeight = .5f)
        assertEquals("Tree(leafColor='Green', currentHeight=0.5)", tree.toString())
    }

    @Test
    fun shouldReturnEmptyLeafColorAndCurrentHeigthZeroPointFive() {
        val tree = Tree(leafColor = "", currentHeight = .5f)
        assertEquals("Tree(leafColor='', currentHeight=0.5)", tree.toString())
    }

    @Test
    fun shouldCallSalaryProvidingAllArguments() {
        val salary = salary(3000.0f, 100.0f, 8.0f)
        assertEquals(240.0f, salary)
    }

    @Test
    fun shouldCallSalaryProvidingOnlyMandatoryArguments() {
        val salary = salary(salary = 3000.0f, workedTime = 8.0f)
        assertEquals(120.0f, salary)
    }

    @Test
    fun shouldReturnThree() {
        assertEquals(3, whichNumberIsBigger(3, 1))
    }

    @Test
    fun shouldReturnFive() {
        assertEquals(5, whichNumberIsBigger(3, 5))
    }

    @Test
    fun shouldCallValidStringAndReturnTrue() {
        assertEquals(true, validString("word"))
    }

    @Test
    fun shouldCallValidStringAndReturnNull() {
        assertEquals(null, validString(null))
    }

    @Test
    fun shouldCallValidStringAndReturnFalse() {
        assertEquals(false, validString(""))
    }
}