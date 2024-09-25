package org.example.lesson_14

fun main() {
    val liner1 = Liner()
    val cargoShip1 = CargoShip()
    val icebreakerShip1 = IcebreakerShip()
}

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 56,
    val passengerCapacity: Int = 6_800,
    val loadCapacity: Int = 200_000,
)

class CargoShip : Liner(
    name = "Грузовой корабль",
    speed = 35,
    passengerCapacity = 25,
    loadCapacity = 500_000,
)

class IcebreakerShip : Liner(
    name = "Ледокол",
    speed = 25,
    passengerCapacity = 128,
    loadCapacity = 21_000
) {
    fun splitIce() {
        println("Расколоть лед")
    }
}