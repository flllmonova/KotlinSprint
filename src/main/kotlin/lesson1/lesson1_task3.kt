package org.example.lesson1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println(String.format("Год полета в космос: %d", year))
    println(String.format("Час взлета: 0%d", hour))
    println(String.format("Минуты взлета: 0%d", minute))

    hour = 10
    minute = 55

    print(String.format("Время посадки: %d:%d", hour, minute))
}