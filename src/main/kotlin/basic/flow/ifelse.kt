@file:Suppress("CascadeIf")

package basic.flow

fun whatHappenedIfElse(year: Int) =
        if (year == 2018)
            "Year I learned Kotlin"
        else if (year in 2019..2022)
            "I do not know the future"
        else
            "I do not know what it happened"

fun whatHappenedWhenCommand(year: Int) = when (year) {
    2018 -> "Year I learned Kotlin"
    2019, 2020, 2021 -> "I do not know th future!"
    else -> "I do not know what it happened"
}

fun whatHappenedWhenAndReturnCommand(year: Int): String {
    return when {
        (true) -> "True!"
        year == 2017 -> "Year I learned Kotlin"
        else -> "I do not know what it happened"
    }
}