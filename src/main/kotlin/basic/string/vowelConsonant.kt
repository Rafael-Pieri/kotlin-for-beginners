package basic.string

fun countVowels(phrase: String): Int {
    val VOWELS = "aeiou"
    var totalVowels = 0

    for (letter in phrase) {
        if (letter.toLowerCase() in VOWELS) totalVowels++
    }

    return totalVowels
}

fun countConsonants(phrase: String): Int {
    val CONSONANTS = "bcdfghjklmnpqrstvwxyzs"
    var totalConsonants = 0

    for (letter in phrase) {
        if (letter.toLowerCase() in CONSONANTS) totalConsonants++
    }

    return totalConsonants
}