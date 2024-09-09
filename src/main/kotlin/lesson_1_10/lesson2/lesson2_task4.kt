package org.example.lesson_1_10.lesson2

const val BUFF_PERCENTAGE = 20
const val HUNDRED_SHARES = 100.0f

fun main() {
    val crystalOreWithoutBuff = 7
    val buffOfCrystalOre = (crystalOreWithoutBuff / HUNDRED_SHARES * BUFF_PERCENTAGE).toInt()

    val ironOreWithoutBuff = 11
    val buffOfIronOre = (ironOreWithoutBuff / HUNDRED_SHARES * BUFF_PERCENTAGE).toInt()

    println("Бафф к кристаллической руде составляет: $buffOfCrystalOre")
    println("Бафф к железной руде составляет: $buffOfIronOre")
}