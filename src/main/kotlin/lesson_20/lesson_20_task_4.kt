package org.example.lesson_20

fun main() {

    val elementsList = listOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь")

    val evenLambdaElementsList = elementsList
        .filter { element: String ->
            elementsList.indexOf(element) % 2 == 0
        }.map { element: String ->
            println("Нажат элемент $element")
        }
}