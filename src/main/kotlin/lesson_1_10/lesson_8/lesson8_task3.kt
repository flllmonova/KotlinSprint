package org.example.lesson8

fun main() {

    val nameOfRoll = "Фокус"
    val ingredientsOfRoll = arrayOf("рис", "нори", "курица", "помидор", "кунжут", "моцарелла")

    println("Какой ингредиент хотите найти в рецепте ролла $nameOfRoll?")
    val requestedIngredient = readln()

    val messageOfIngredientPresence =
        if (requestedIngredient in ingredientsOfRoll) "Ингредиент $requestedIngredient в рецепте есть"
        else "Такого ингредиента в рецепте нет"

    println(messageOfIngredientPresence)
}