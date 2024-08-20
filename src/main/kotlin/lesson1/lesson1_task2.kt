package org.example.lesson1

fun main() {
    var numberOfOrders: UInt = 75u
    val messageOfSuccefulPurchase: String = "Спасибо за покупку!"

    println("Количество заказов: $numberOfOrders")
    println("Сообщение благодарность за покупку: \"$messageOfSuccefulPurchase\"")

    var numberOfEmployees: UInt = 2000u
    // println("Количество работников: $numberOfEmployees")

    numberOfEmployees -= 1u
    println("Количество работников: $numberOfEmployees")
}