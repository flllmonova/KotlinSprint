package org.example.lesson_18

abstract class Parcel {

    abstract fun getSurfacesArea(): Float
}

class CubicParcel(
    private val edge: Float,
) : Parcel() {

    private val sidesAmount = 6

    override fun getSurfacesArea(): Float = edge * edge * sidesAmount
}

class RectangularParcel(
    private val length: Float,
    private val width: Float,
    private val height: Float,
) : Parcel() {

    override fun getSurfacesArea(): Float = 2 * ((length * width) + (length * height) + (width * height))
}