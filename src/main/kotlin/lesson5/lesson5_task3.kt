package org.example.lesson5

const val INITIAL_NUMBER_OF_ITERATION = 1
const val FINAL_NUMBER_OF_ITERATION = 2

fun main() {

    val listOfWinningNumbers = listOf(10, 20)

    println("Угадайте два числа от 0 до 42")

    val listOfNumbers = ArrayList<Int>()
    for (i in INITIAL_NUMBER_OF_ITERATION..FINAL_NUMBER_OF_ITERATION) {
        println("Введите $i число:")
        listOfNumbers.add(readLine()!!.toInt())
    }

    val numberOfMatches = listOfNumbers.intersect(listOfWinningNumbers).size
    val resultText = when (numberOfMatches) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(resultText)
    println("Для победы нужны были числа: $listOfWinningNumbers")
}