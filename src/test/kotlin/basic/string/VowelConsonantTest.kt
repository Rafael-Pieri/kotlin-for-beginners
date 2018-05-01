package basic.string

import org.junit.Assert.assertEquals
import org.junit.Test

class VowelConsonantTest {

    @Test
    fun countVowels() {
        assertEquals(11, countVowels("How many vowels does this phrase have?"))
    }

    @Test
    fun countConsonants() {
        assertEquals(25, countConsonants("Usually a phrase has more consonant than vowels!"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val phrase = "I am really enjoying learning Kotlin!"
        assertEquals(12, countVowels(phrase))
        assertEquals(19, countConsonants(phrase))
    }
}