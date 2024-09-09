package org.example.lesson_1_10.lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println(String.format("Год полета в космос: %s", year))
    println(String.format("Час взлета: %s", hour))
    println(String.format("Минуты взлета: %s", minute))

    hour = "10"
    minute = "55"

    print(String.format("Время посадки: %s:%s", hour, minute))
}