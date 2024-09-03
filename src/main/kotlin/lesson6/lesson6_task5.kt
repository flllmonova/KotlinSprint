package org.example.lesson6

import kotlin.random.Random

fun main() {
    var attemptsNumber = 3
    val beginningOfInterval = 1
    val endOfInterval = 10

    println("Для проверки что вы не бот, решите простой математический пример")

    while (attemptsNumber-- > 0) {
        val number1 = Random.nextInt(beginningOfInterval, endOfInterval)
        val number2 = Random.nextInt(beginningOfInterval, endOfInterval)
        val sumOfNumbers = number1 + number2

        println("$number1 + $number2 = ?")

        val userAnswer = readln().toInt()

        if (userAnswer == sumOfNumbers) {
            println("Добро пожаловать!")
            break
        } else {
            if (attemptsNumber == 0) {
                println("Доступ запрещен")
                break
            }
            println("Неверно. Оставшиеся попытки: $attemptsNumber")
        }
    }
}