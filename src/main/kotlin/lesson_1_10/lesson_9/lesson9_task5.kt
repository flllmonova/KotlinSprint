package org.example.lesson9

const val INGREDIENTS_COUNT = 5

fun main() {

    val ingredientsList: MutableList<String> = mutableListOf()

    println("Создадим список ингредиентов")
    for (i in 1..INGREDIENTS_COUNT) {
        println("Напишите ингредиент номер: $i")
        ingredientsList.add(readln().trim())
    }

    println(ingredientsList.toSet().sorted().joinToString().replaceFirstChar { it.uppercase() })
}