package org.example.lesson2

const val NUMBER_OF_MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes =  (departureHour * NUMBER_OF_MINUTES_IN_HOUR) + departureMinute
    val totalDepartureAndTravelTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalHour = totalDepartureAndTravelTimeInMinutes / NUMBER_OF_MINUTES_IN_HOUR
    val arrivalMinute = totalDepartureAndTravelTimeInMinutes % NUMBER_OF_MINUTES_IN_HOUR

    System.out.printf("%02d:%02d", arrivalHour, arrivalMinute)
}