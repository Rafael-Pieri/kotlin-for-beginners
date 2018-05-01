package basic.flow

fun loopUsingFor(): List<Int> {
    val numbers: MutableList<Int> = mutableListOf()

    for ((index, currentValue) in (1..10).withIndex()) {
        numbers.add(index, currentValue)
    }

    return numbers
}

fun loopUsingForAndStepCommand(): List<Int> {
    val numbers: MutableList<Int> = mutableListOf()

    for ((index, currentValue) in (10 downTo 1 step 1).withIndex()) {
        numbers.add(index, currentValue)
    }

    return numbers
}

fun loopUsingWhile(): List<Int> {
    val numbers: MutableList<Int> = mutableListOf()
    var index = 0
    var value = 1

    while (index < 10) {
        numbers.add(index, value)
        index++
        value++
    }

    return numbers
}

fun loopUsingDoWhile(): List<Int> {
    val numbers: MutableList<Int> = mutableListOf()
    var index = 0
    var value = 1

    do {
        numbers.add(index, value)
        index++
        value++
    } while (index < 10)

    return numbers
}