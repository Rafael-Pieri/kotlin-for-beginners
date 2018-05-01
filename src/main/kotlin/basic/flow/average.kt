package basic.flow

fun myResults(average: Int, vararg notes: Int): String {
    val myAverage = notes.sum() / notes.size
    return when {
        myAverage == average -> "I got approved!"
        myAverage < average -> "I did not approved!"
        myAverage in average..9 -> "I got approved with above average score!"
        else -> "I got approved with excellence!"
    }
}
