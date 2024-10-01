package org.example.lesson_17

fun main() {
    val parcel = Parcel(562455695, "Москва")
    parcel.getNumberOfParcelMoves()
    parcel.parcelCurrentLocation = "Уфа"
    parcel.getNumberOfParcelMoves()
}

class Parcel(
    val parcelNumber: Long,
    _parcelCurrentLocation: String,
) {
    var parcelCurrentLocation = _parcelCurrentLocation
        set(value) {
            field = value
            ++movementCounter
        }

    private var movementCounter: Int = 0

    fun getNumberOfParcelMoves() {
        println("Число перемещений: $movementCounter")
    }
}