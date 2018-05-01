package basic.string

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    val sbPhrase = StringBuilder()
    var index = str.length - 1

    while (index >= 0) {
        sbPhrase.append(str[index])
        index--
    }

    return sbPhrase.toString()
}