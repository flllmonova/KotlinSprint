package org.example.lesson_11_20.lesson_18

fun main() {

    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val dicesList: List<Dice> = listOf(dice1, dice2, dice3)

    dicesList.forEach { it.throwDice() }
}

abstract class Dice {

    abstract val sidesAmount: Int

    abstract fun throwDice()
}

class FourSidedDice : Dice() {
    override val sidesAmount = 4

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-х гранной игральной кости выпало число $number")
    }
}

class SixSidedDice : Dice() {
    override val sidesAmount = 6

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-и гранной игральной кости выпало число $number")
    }
}

class EightSidedDice : Dice() {
    override val sidesAmount = 8

    override fun throwDice() {
        val number = (1..sidesAmount).random()
        println("На $sidesAmount-и гранной игральной кости выпало число $number")
    }
}