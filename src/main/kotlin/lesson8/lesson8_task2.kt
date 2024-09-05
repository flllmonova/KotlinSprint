package org.example.lesson8

fun main() {

    val nameOfRoll = "Фокус"
    val ingredientsOfRoll = arrayOf("рис", "нори", "курица", "помидор", "кунжут", "моцарелла")

    println("Какой ингредиент хотите найти в рецепте ролла $nameOfRoll?")
    val requestedIngredient = readln()
    var isIngredientThere = false

    for (i in ingredientsOfRoll) {
        if (i == requestedIngredient) {
            println("Ингредиент $requestedIngredient в рецепте есть")
            isIngredientThere = true
            break
        }
    }

    if (!isIngredientThere) println("Такого ингредиента в рецепте нет")
}