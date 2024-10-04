package org.example.lesson_18

fun main() {

    val order1 = Order().printOrder(
        4578963251,
        "BMW F82"
    )
    val order2 = Order().printOrder(
        478624634,
        listOf("BMW F92", "Audi RS6", "Jeep Wrangler Rubicon")
    )
}

class Order {

    fun printOrder(orderNumber: Long, product: String) {
        println("Заказан товар: $product")
    }

    fun printOrder(orderNumber: Long, productsList: List<String>) {
        println("Заказаны следующие товары: ${productsList.joinToString(", ")}")
    }
}