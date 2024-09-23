package org.example.lesson_14

fun main() {
    val liner1 = Liner()
    val cargoShip1 = CargoShip()
    val icebreakerShip1 = IcebreakerShip()
}

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 500,
    val capacity: Int = 25,
    val loadCapacity: Int = 500,
)

class CargoShip : Liner(name = "Грузовой", speed = 250, capacity = 10, loadCapacity = 1000)

class IcebreakerShip : Liner(name = "Ледокол", speed = 250, capacity = 10, loadCapacity = 500) {
    fun splitIce() {
        println("Расколоть лед")
    }
}