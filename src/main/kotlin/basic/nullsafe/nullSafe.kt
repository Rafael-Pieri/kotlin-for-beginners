package basic.nullsafe

fun nullSafeString(): Boolean {
    val str: String? = null
    return str == null
}

fun getNullExampleJavaInstance(): NullExampleJava? {
    return NullExampleJava.getInstance()
}

fun getNullExampleJavaByConstructor(): NullExampleJava {
    return NullExampleJava()
}

fun getStringLengthWithSafeCallOperator(str: String?): Int? {
    return str?.length
}

fun getStringLengthWithoutSafeCallOperator(str: String?): Int? {
    return str!!.length
}