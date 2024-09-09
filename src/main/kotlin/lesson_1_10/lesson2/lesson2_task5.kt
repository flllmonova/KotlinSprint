package org.example.lesson_1_10.lesson2
import kotlin.math.pow

fun main() {
    val amountOfDepositInRubles = 70_000
    val rateOfInterest = 16.7
    val timeOfDeposit = 20

    val totalAmountOfDepositInRubles = amountOfDepositInRubles * (1 + rateOfInterest / 100).pow(timeOfDeposit)

    println(String.format("%.3f", totalAmountOfDepositInRubles))
}