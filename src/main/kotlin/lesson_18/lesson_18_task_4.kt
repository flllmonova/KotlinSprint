package org.example.lesson_18

abstract class Box {

    abstract fun getSurfacesArea(): Float
}

class CubicBox(
    private val edge: Float,
) : Box() {

    private val sidesAmount = 6

    override fun getSurfacesArea(): Float = edge * edge * sidesAmount
}

class RectangularBox(
    private val length: Float,
    private val width: Float,
    private val height: Float,
) : Box() {

    override fun getSurfacesArea(): Float = 2 * ((length * width) + (length * height) + (width * height))
}