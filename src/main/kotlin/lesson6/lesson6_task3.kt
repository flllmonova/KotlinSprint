package org.example.lesson6

const val SECOND_IN_MILLISECONDS: Long = 1000

fun main() {
    println("Сколько секунд засечь?")

    var clockedSeconds = readln().toInt()

    while (clockedSeconds > 0) {
        println("Осталось секунд: ${clockedSeconds--}")
        Thread.sleep(SECOND_IN_MILLISECONDS)
    }

    println("Время вышло")
}