package basic.flow

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.*

class IfElseTest {

    private var year: Int = 0

    @Before
    fun setup() {
        val calendar: Calendar = Calendar.getInstance()
        this.year = calendar.get(Calendar.YEAR)
    }

    @Test
    fun shouldReturnWhatHappenedIfElse() {
        val event = whatHappenedIfElse(this.year)
        assertEquals("I do not know the future", event)
    }

    @Test
    fun shouldReturnWhatHappenedWhenCommand() {
        val event = whatHappenedWhenCommand(this.year)
        assertEquals("I do not know the future", event)
    }

    @Test
    fun shouldReturnWhatHappenedWhenAndReturnCommand() {
        val event = whatHappenedWhenAndReturnCommand(this.year)
        assertEquals("True!", event)
    }
}