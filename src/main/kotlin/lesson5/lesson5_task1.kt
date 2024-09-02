package org.example.lesson5

fun main() {

    val answerOfVerification = 8
    println(
        "Решите простой пример для проверки, что вы не бот\n3 + 5 = ?"
    )

    val userAnswer = readLine()!!.toInt()
    when (userAnswer) {
        answerOfVerification -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}