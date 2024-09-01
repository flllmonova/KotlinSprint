package org.example.lesson4

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
        (IS_SUNNY == isSunny) &&
        (IS_AWNING_OPEN == isAwningOpen) &&
        (REQUIRED_AIR_HUMIDITY == currentAirHumidity) &&
        (UNFAVORABLE_TIME_OF_YEAR != currentTimeOfYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")
}