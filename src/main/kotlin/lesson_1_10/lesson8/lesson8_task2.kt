package org.example.lesson_1_10.lesson8

fun main() {

    val nameOfRoll = "Фокус"
    val ingredientsOfRoll = arrayOf("рис", "нори", "курица", "помидор", "кунжут", "моцарелла")

    println("Какой ингредиент хотите найти в рецепте ролла $nameOfRoll?")
    val requestedIngredient = readln()

    for (i in ingredientsOfRoll) {
        if (i == requestedIngredient) {
            println("Ингредиент $requestedIngredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}