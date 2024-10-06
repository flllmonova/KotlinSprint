package org.example.lesson_19

fun main() {
    val product1 = Product("Ручка шариковая черная", 1424754, Category.OFFICE_SUPPLIES)
    val product2 = Product("Свитшот летний", 4578145, Category.CLOTHES)
    val product3 = Product("Кисть для контуринга", 95655654, Category.DIFFERENT)

    product1.getProductInfo()
    println()
    product2.getProductInfo()
    println()
    product3.getProductInfo()
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun getProductInfo() {
        println("Информация о товаре:\nНазвание: $name\nId: $id\nКатегория: ${category.getCategory()}")
    }
}

enum class Category {
    OFFICE_SUPPLIES {
        override fun getCategory() = "Канцелярские товары"
    },
    CLOTHES {
        override fun getCategory() = "Одежда"
    },
    DIFFERENT {
        override fun getCategory() = "Разное"
    };

    abstract fun getCategory(): String
}
