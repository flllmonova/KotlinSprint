package org.example.lesson_16

private const val PI = 3.14f

fun main() {
    val circle = Circle(2.5f)
    println(String.format("Площадь круга: %.2f", circle.area))
    println(String.format("Длина окружности: %.2f", circle.circumference))
}

class Circle(
    private val radius: Float,
) {
    val area: Float
        get() = radius * radius * PI

    val circumference: Float
        get() = 2 * PI * radius
}