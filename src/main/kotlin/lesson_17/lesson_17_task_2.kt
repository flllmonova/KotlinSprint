package org.example.lesson_17

fun main() {
    val ship = Ship("Призрак", 20, "Калининград")
    ship.name = "Magnifica"
}

class Ship(
    _name: String,
    var averageScore: Int,
    var homePort: String,
) {
    var name = _name
        set(value) {
            println("Вы не можете поменять имя корабля")
        }
}