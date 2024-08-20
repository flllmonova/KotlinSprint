package org.example.lesson1

fun main() {
    val year: UInt = 1961u
    var hour: UInt = 9u
    var minute: UInt = 7u

    println("Год полета в космос: $year")
    println("Час взлета: $hour")
    println("Минуты взлета: $minute")

    hour = 10u
    minute = 55u

    print("Время посадки: $hour:$minute")
}