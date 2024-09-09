package org.example.lesson_1_10.lesson2

const val NUMBER_OF_MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes =  (departureHour * org.example.lesson_1_10.lesson2.NUMBER_OF_MINUTES_IN_HOUR) + departureMinute
    val totalDepartureAndTravelTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalHour = totalDepartureAndTravelTimeInMinutes / org.example.lesson_1_10.lesson2.NUMBER_OF_MINUTES_IN_HOUR
    val arrivalMinute = totalDepartureAndTravelTimeInMinutes % org.example.lesson_1_10.lesson2.NUMBER_OF_MINUTES_IN_HOUR
    val arrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)

    println(arrivalTime)
}