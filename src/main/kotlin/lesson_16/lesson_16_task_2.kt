package org.example.lesson_16

private const val PI = 3.14f

fun main() {
    val circle = Circle(2.5f)
    println(String.format("Площадь круга: %.2f", circle.getArea()))
    println(String.format("Длина окружности: %.2f", circle.getCircumference()))
}

class Circle(
    private val radius: Float,
) {

    fun getArea(): Float = PI * radius * radius

    fun getCircumference(): Float = 2 * PI * radius
}