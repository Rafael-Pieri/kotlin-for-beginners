package basic.main

import java.util.*

fun main(args: Array<String>) {
    val name = "Rafael"
    val lastName = "Barbosa"
    var age = 18
    val calendar: Calendar = Calendar.getInstance()

    val year = calendar.get(Calendar.YEAR)

    println("name: $name")
    println("lastName: $lastName")
    println("age: $age")
    println("year: $year")

    age = 23

    println("udpated age: $age")

    val strTest = "Test" +
            " Testing" +
            ".I'm liking strings"

    val strMyName = """My name
is
        Rafael
    .Test
I'm liking strings
""".trimMargin()

    println(strTest)
    println(strMyName)
}