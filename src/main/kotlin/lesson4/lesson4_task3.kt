package org.example.lesson4

const val REQUIRED_AIR_HUMIDITY = 20
const val REQUIRED_TIME_OF_YEAR = "не зима"

fun main() {
    val weatherIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val currentTimeOFYear = "зима"

    val analysisOfConditions = (weatherIsSunny) && awningIsOpen && (airHumidity == REQUIRED_AIR_HUMIDITY) && (currentTimeOFYear == REQUIRED_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")
}