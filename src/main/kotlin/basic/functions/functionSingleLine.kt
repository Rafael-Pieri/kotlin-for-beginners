package basic.functions

fun toUpper(str: String) = str.toUpperCase()

fun getPositionValue(str: String, index: Int): Char = str[index - 1]

fun sum(vararg numbers: Int) = numbers.sum()