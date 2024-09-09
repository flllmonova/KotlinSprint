package org.example.lesson7

const val NUMBER_OF_MILLISECONDS_IN_SECOND = 1000L

fun main() {

    println("Сколько секунд засечь?")
    val clockedSeconds = readln().toInt()
    var passedSecondsCounter = 0

    for (i in clockedSeconds downTo 1) {
        println(
            """
            Прошло: ${passedSecondsCounter++} сек.
            До конца таймера осталось: $i сек.
            
        """.trimIndent()
        )
        if (passedSecondsCounter == clockedSeconds) println("Прошло: $passedSecondsCounter сек.\nВремя вышло")
        Thread.sleep(NUMBER_OF_MILLISECONDS_IN_SECOND)
    }
}