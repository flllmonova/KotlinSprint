package org.example.lesson6

const val NUMBER_OF_MILLISECONDS_IN_SECOND = 1000

fun main() {

    println("Сколько секунд засечь?")

    val clockedSeconds = readln().toInt()
    val clockedTimeInMilliseconds = (clockedSeconds * NUMBER_OF_MILLISECONDS_IN_SECOND).toLong()

    Thread.sleep(clockedTimeInMilliseconds)
    println("Прошло $clockedSeconds секунд")
}