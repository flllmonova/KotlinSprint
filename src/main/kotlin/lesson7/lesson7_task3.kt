package org.example.lesson7

fun main() {

    println("Введите конечное число диапазона:")
    val endOfRange = readln().toInt()
    val range = 0..endOfRange
    val numberOfStepsForOutputEvenNumbers = 2

    for (i in range step numberOfStepsForOutputEvenNumbers) {
        println(i)
    }
}