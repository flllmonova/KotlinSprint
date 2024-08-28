package org.example.lesson4

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val REQUIRED_AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val currentTimeOfYear = "зима"

    val analysisOfConditions =
        (SUNNY_WEATHER == isSunny) &&
        (OPEN_AWNING == isAwningOpen) &&
        (REQUIRED_AIR_HUMIDITY == airHumidity) &&
        (UNFAVORABLE_TIME_OF_YEAR != currentTimeOfYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")
}