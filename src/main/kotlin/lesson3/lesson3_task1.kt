package org.example.lesson3

fun main() {
    val userName = "Владислав"
    var greeting = "Добрый день"
    var greetingMessage = "$greeting, $userName!"

    println(greetingMessage)

    greeting = "Добрый вечер"
    greetingMessage = "$greeting, $userName!"

    println(greetingMessage)
}