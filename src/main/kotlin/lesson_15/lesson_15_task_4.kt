package org.example.lesson_15

abstract class Product(
    val name: String,
    val stockBalance: Int,
)

class Instrument(
    name: String,
    stockBalance: Int,
    val category: String = "Инструмент",
) : Product(name, stockBalance), ComponentSearch

class Component(
    name: String,
    stockBalance: Int,
    val category: String = "Комплектующие",
) : Product(name, stockBalance)

interface ComponentSearch {
    fun searchComponent() {
        println("Выполняется поиск")
    }
}