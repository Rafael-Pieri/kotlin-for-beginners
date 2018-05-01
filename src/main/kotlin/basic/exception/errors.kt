package basic.exception

fun throwCustomException(strNumber: String) {
    try {
        strNumber.toInt()
    } catch (e: NumberFormatException) {
        throw ErrorsException("It is not a number")
    }
}

fun runFinallyPart(strNumber: String) {
    try {
        strNumber.toInt()
    } finally {
        throw ErrorsException("Finally part")
    }
}