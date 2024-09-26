package org.example.lesson_15

abstract class Product {
    abstract val name: String
    abstract val stockBalance: Int
}

class MusicalInstrument(
    override val name: String,
    override val stockBalance: Int,
    val category: String = "Инструмент",
) : Product(), ComponentsSearch

class Components(
    override val name: String,
    override val stockBalance: Int,
    val category: String = "Комплектующие",
) : Product()

interface ComponentsSearch {
    fun searchComponents() {
        println("Выполняется поиск")
    }
}