package org.example.lesson_11

fun main() {

}

class Ingredient(
    val name: String,
    val amount: Int,
    val unitOfMeasure: String,
)

class Recipe(
    val id: Int,
    val name: String,
    val category: Category,
    val cover: String,
    val ingredientsList: MutableList<Ingredient> = mutableListOf(),
    var cookingMethod: String = "",
    var inFavourite: Boolean = false,
) {
    fun calculateIngredientsForRequiredServingsNumber(requiredServingsNumber: Int) {
        println("Расчет ингредиентов для приготовления блюда $name в количестве $requiredServingsNumber порций:")
        ingredientsList.forEach { ingredient: Ingredient ->
            println("${ingredient.name}: ${ingredient.amount * requiredServingsNumber} ${ingredient.unitOfMeasure}")
        }
    }

    fun addInFavourite() {
        inFavourite = true
    }

    fun removeFromFavourite() {
        inFavourite = false
    }

    fun addCookingMethod() {
        println("Напишите способ приготовления:")
        cookingMethod = readln()
    }
}

class Category(
    val name: String,
    val description: String,
    val cover: String,
)