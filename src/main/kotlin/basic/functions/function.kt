package basic.functions

class Tree(var leafColor: String = "Green", var currentHeight: Float) {
    override fun toString(): String {
        return "Tree(leafColor='$leafColor', currentHeight=$currentHeight)"
    }
}

fun salary(salary: Float, hourlyRate: Float = 200.0f, workedTime: Float): Float {
    return salary / hourlyRate * workedTime
}

fun whichNumberIsBigger(n1: Int, n2: Int): Int {
    return if (n1 > n2) n1 else n2
}

fun String.isValid() = (this.isNotBlank() && this.isNotEmpty())

fun validString(str: String?): Boolean? {
    return str?.isValid()
}