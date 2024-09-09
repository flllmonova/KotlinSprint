package org.example.lesson_1_10.lesson6

fun main() {
    var attemptsNumber = 3
    val beginningOfInterval = 1
    val endOfInterval = 9

    println("Для проверки что вы не бот, решите простой математический пример")

    while (attemptsNumber-- > 0) {
        val range = beginningOfInterval..endOfInterval
        val number1 = range.random()
        val number2 = range.random()
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