package org.example.lesson5

import kotlin.random.Random
import kotlin.random.nextInt

const val INITIAL_NUMBER_OF_INTERVAL = 0
const val FINAL_NUMBER_OF_INTERVAL = 42
const val INITIAL_ITERATION_NUMBER = 1
const val FINAL_ITERATION_NUMBER = 3
const val MIN_NUMBER_OF_MATCHES = 1
const val MID_NUMBER_OF_MATCHES = 2
const val MAX_NUMBER_OF_MATCHES = 3

fun main() {

    var listOfWinningNumbers = ArrayList<Int>()
    for (i in INITIAL_ITERATION_NUMBER..FINAL_ITERATION_NUMBER) {
        listOfWinningNumbers.add(Random.nextInt(INITIAL_NUMBER_OF_INTERVAL..FINAL_NUMBER_OF_INTERVAL))
    }

    println("Угадайте три числа от $INITIAL_NUMBER_OF_INTERVAL до $FINAL_NUMBER_OF_INTERVAL")

    var listOfNumbers = ArrayList<Int>()
    for (i in INITIAL_ITERATION_NUMBER..FINAL_ITERATION_NUMBER) {
        println("Введите $i число:")
        listOfNumbers.add(readln().toInt())
    }

    val numberOfMatches = listOfNumbers.intersect(listOfWinningNumbers).size
    val resultText = when (numberOfMatches) {
        MAX_NUMBER_OF_MATCHES -> "Вы угадали все числа и выиграли джекпот!"
        MID_NUMBER_OF_MATCHES -> "Вы угадали два числа и получаете крупный приз!"
        MIN_NUMBER_OF_MATCHES -> "Вы угадали одно число и вам будет выплачен утешительный приз."
        else -> "Вы не угадали ни одного числа."
    }

    println(resultText)
    println("Выигрышные числа: $listOfWinningNumbers")
}