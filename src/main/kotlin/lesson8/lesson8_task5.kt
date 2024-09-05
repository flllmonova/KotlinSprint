package org.example.lesson8

fun main() {
    println("Сколько ингредиентов планируете записать?")
    val sizeOfIngredientsArray = readln().toInt()

    val ingredientsArray = Array(sizeOfIngredientsArray) { "место-для-ингредиента" }

    for (i in 0 until sizeOfIngredientsArray) {
        println("Впишите ингредиент номер: ${i + 1}")
        ingredientsArray[i] = readln()
    }

    println("\nВаш список ингредиентов:")
    println(ingredientsArray.joinToString())
}