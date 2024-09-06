package org.example.lesson9

fun main() {
    val nameOfSalad = "Греческий"
    val listOfSaladIngredients = listOf(
        "огурец", "помидор", "перец болгарский", "листья салата", "маслины", "масло оливковое",
        "сыр фета", "лимон", "орегано", "перец душистый", "соль", "сахар", "чеснок"
    )

    println("В рецепте салата $nameOfSalad есть следующие ингредиенты:")
    listOfSaladIngredients.forEach { ingredient: String ->
        println(ingredient)
    }
}