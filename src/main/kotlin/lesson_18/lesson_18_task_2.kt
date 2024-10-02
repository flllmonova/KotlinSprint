package org.example.lesson_18

fun main() {

    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val dicesList: List<Dice> = listOf(dice1, dice2, dice3)

    dicesList.forEach {
        it.throwDice()
    }
}

open class Dice {
    open fun throwDice() {}
}

class FourSidedDice : Dice() {
    private val sidesAmount = 4

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-х гранной игральной кости выпало число $number")
    }
}

class SixSidedDice : Dice() {
    private val sidesAmount = 6

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-х гранной игральной кости выпало число $number")
    }
}

class EightSidedDice : Dice() {
    private val sidesAmount = 8

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-х гранной игральной кости выпало число $number")
    }
}