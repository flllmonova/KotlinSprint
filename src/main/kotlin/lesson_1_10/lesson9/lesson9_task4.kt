package org.example.lesson_1_10.lesson9

fun main() {

    println("Напишите 5 ингредиентов через запятую c пробелом")
    val ingredientsList = readln().split(", ").sorted()

    println(ingredientsList)
}
