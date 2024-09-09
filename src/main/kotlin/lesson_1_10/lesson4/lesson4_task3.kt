package org.example.lesson_1_10.lesson4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val REQUIRED_AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val currentAirHumidity = 20
    val currentTimeOfYear = "зима"

    val analysisOfConditions =
        (isSunny == IS_SUNNY) &&
        (isAwningOpen == IS_AWNING_OPEN) &&
        (currentAirHumidity == REQUIRED_AIR_HUMIDITY) &&
        (currentTimeOfYear != UNFAVORABLE_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")
}