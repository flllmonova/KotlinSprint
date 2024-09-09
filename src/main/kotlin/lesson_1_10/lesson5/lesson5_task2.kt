package org.example.lesson_1_10.lesson5

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите ваш год рождения:")

    val yearOfUserBirth = readLine()!!.toInt()
    val currentYear = 2024
    val userAge = currentYear - yearOfUserBirth

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}