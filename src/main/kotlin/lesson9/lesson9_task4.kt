package org.example.lesson9

fun main() {

    println("Напишите 5 ингредиентов через запятую c пробелом")
    val ingredientsList = readln().split(", ").sorted()

    println(ingredientsList)
}
