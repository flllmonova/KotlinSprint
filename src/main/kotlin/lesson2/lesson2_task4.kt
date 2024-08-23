package org.example.lesson2

const val BUFF_PERCENTAGE = 0.2f

fun main() {
    val crystalOreWithoutBuff = 7
    val buffOfCrystalOre = (crystalOreWithoutBuff * BUFF_PERCENTAGE).toInt()

    val ironOreWithoutBuff = 11
    val buffOfIronOre = (ironOreWithoutBuff * BUFF_PERCENTAGE).toInt()

    println("Бафф к кристаллической руде составляет: $buffOfCrystalOre")
    println("Бафф к железной руде составляет: $buffOfIronOre")
}