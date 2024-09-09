package org.example.lesson_1_10.lesson5

fun main() {

    val number1 = 30
    val number2 = 7
    val answerOfVerification = number1 + number2

    println(
        "Решите простой пример для проверки, что вы не бот\n$number1 + $number2 = ?"
    )

    val answerOfUser = readln().toInt()

    if (answerOfUser == answerOfVerification) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}