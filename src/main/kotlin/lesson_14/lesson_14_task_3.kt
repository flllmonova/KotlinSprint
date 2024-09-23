package org.example.lesson_14

import kotlin.math.pow

const val PI_NUMBER = 3.14f

fun main() {
    val figuresList = listOf(
        Circle(4.5f, "белый"),
        Circle(6f, "черный"),
        Circle(2.3f, "черный"),
        Rectangle(4f, 8f, "черный"),
        Rectangle(2.1f, 7.5f, "белый"),
        Rectangle(5f, 4f, "белый")
    )

    val perimetersSumOfBlackFigures = figuresList
        .filter { figure: Figure -> figure.color == "черный" }
        .map { figure: Figure -> figure.findPerimeter() }
        .sum()

    val areasSumOfWhiteFigures = figuresList
        .filter { figure: Figure -> figure.color == "белый" }
        .map { figure: Figure -> figure.findArea() }
        .sum()

    println(
        String.format(
            "Сумма периметров всех черных фигур: %.2f\nСумма площадей всех белых фигур: %.2f",
            perimetersSumOfBlackFigures, areasSumOfWhiteFigures
        )
    )
}

abstract class Figure(
    val color: String,
) {
    abstract fun findArea(): Float

    abstract fun findPerimeter(): Float
}

class Circle(
    val radius: Float,
    color: String,
) : Figure(color) {

    override fun findArea(): Float = (PI_NUMBER * radius.pow(2))
    override fun findPerimeter(): Float = (2 * PI_NUMBER * radius)
}

class Rectangle(
    val width: Float,
    val length: Float,
    color: String,
) : Figure(color) {

    override fun findPerimeter(): Float = (2 * (width + length))

    override fun findArea(): Float = (width * length)
}