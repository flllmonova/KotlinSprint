package org.example.lesson2
import kotlin.math.pow

fun main() {
    val amountOfDepositInRubles = 70_000
    val rateOfInterest = 16.7
    val timeOfDeposit = 20

    // формула сложного процента с ежегодной капитализацией
    // итоговый_размер_вклада = сумма_вклада * (1 + процентная_ставка / 100) ^ срок_вклада
    val totalAmountOfDepositInRubles = amountOfDepositInRubles * (1 + rateOfInterest / 100).pow(timeOfDeposit)

    System.out.printf("%.3f", totalAmountOfDepositInRubles)
}