package org.example.lesson_1_10.lesson9

fun main() {

    val ingredientsList = mutableListOf("содовая вода", "сок лимона", "листья мяты")

    println("В рецепте есть базовые ингредиенты: \n$ingredientsList")

    println("Желаете добавить еще?")
    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredientsList.add(readln())
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: \n$ingredientsList")
}
