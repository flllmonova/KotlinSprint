package org.example.lesson5

const val FIRST_WINNING_NUMBER = 10
const val SECOND_WINNING_NUMBER = 20

fun main() {

    println("Угадайте два числа от 0 до 42")

    println("Введите первое число:")
    val firstNumber = readLine()!!.toInt()

    println("Введите второе число:")
    val secondNumber = readLine()!!.toInt()

    val isFirstNumberWinning = when {
        firstNumber == FIRST_WINNING_NUMBER || firstNumber == SECOND_WINNING_NUMBER -> true
        else -> false
    }
    val isSecondNumberWinning = when {
        secondNumber == FIRST_WINNING_NUMBER || secondNumber == SECOND_WINNING_NUMBER -> true
        else -> false
    }
    val textResult = when {
        (isFirstNumberWinning == true) && (isSecondNumberWinning == true) -> "Поздравляем! Вы выиграли главный приз!"
        (isFirstNumberWinning == true) || (isSecondNumberWinning == true) -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(textResult)
    println("Для победы нужны были числа: $FIRST_WINNING_NUMBER и $SECOND_WINNING_NUMBER")
}
