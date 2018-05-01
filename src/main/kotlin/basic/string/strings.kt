package basic.string

fun removePrefix(str: String, prefix: String): String {
    return str.removePrefix(prefix)
}

fun getPositionValue(str: String, index: Int): Char {
    return str[index - 1]
}

fun removeRange(str: String, startIndex: Int, endIndex: Int): String {
    return str.removeRange(startIndex, endIndex)
}

fun plusValue(str: String, any: Any): String {
    return str.plus(any)
}
