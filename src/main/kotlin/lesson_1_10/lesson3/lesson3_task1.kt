package org.example.lesson_1_10.lesson3

fun main() {
    val userName = "Владислав"
    var greeting = "Добрый день"
    var greetingMessage = "$greeting, $userName!"

    println(greetingMessage)

    greeting = "Добрый вечер"
    greetingMessage = "$greeting, $userName!"

    println(greetingMessage)
}