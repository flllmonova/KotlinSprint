package org.example.lesson_1_10.lesson8

fun main() {
    val arrayOfIngredients = arrayOf(
        "баклажан", "оливковое масло", "репчатый лук", "вино белое", "сыр полутвердый", "соль", "уцхо-сунели"
    )

    println("Список ингредиентов: [${arrayOfIngredients.joinToString()}]")

    println("Какой ингредиент вы бы хотели заменить?")
    var replacementIngredient = readln()

    while (replacementIngredient !in arrayOfIngredients) {
        println("Такого ингредиента нет в списке, введите другой")
        replacementIngredient = readln()
    }

    println("Напишите новый ингредиент")
    arrayOfIngredients[arrayOfIngredients.indexOf(replacementIngredient)] = readln()

    println("Готово! Вы сохранили следующий список: [${arrayOfIngredients.joinToString()}]")
}
