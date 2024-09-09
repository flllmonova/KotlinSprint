package org.example.lesson9

fun main() {

    val ingredientsAmount = mutableListOf(2, 50, 15)
    var indexCounter = 0

    println("На сколько порций нужно приготовить омлет?")
    val servingsCount = readln().toInt()

    ingredientsAmount.replaceAll {
        it * servingsCount
    }

    println(
        "На $servingsCount порций вам понадобится: " +
        "яиц – ${ingredientsAmount[indexCounter++]}шт., " +
        "молока – ${ingredientsAmount[indexCounter++]}мл., " +
        "сливочного масла – ${ingredientsAmount[indexCounter]}гр."
    )
}
