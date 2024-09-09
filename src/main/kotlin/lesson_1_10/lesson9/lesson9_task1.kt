package org.example.lesson_1_10.lesson9

fun main() {

    val ingredientsList = listOf(
        "огурец", "помидор", "перец болгарский", "листья салата", "маслины", "масло оливковое",
        "сыр фета", "лимон", "орегано", "перец душистый", "соль", "сахар", "чеснок"
    )

    println("В рецепте есть следующие ингредиенты:")
    ingredientsList.forEach { ingredient: String ->
        println(ingredient)
    }
}