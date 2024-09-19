package org.example.lesson_12

fun main() {

    val weatherForToday = WeatherDataForDay()
    val weatherForTomorrow = WeatherDataForDay()

    weatherForToday.daytimeTemperature = "+12"
    weatherForToday.nightTemperature = "+4"
    weatherForToday.isTherePrecipitation = true

    weatherForTomorrow.daytimeTemperature = "+19"
    weatherForTomorrow.nightTemperature = "+6"
    weatherForTomorrow.isTherePrecipitation = false

    weatherForToday.printData()
    weatherForTomorrow.printData()
}

class WeatherDataForDay {

    var daytimeTemperature = "+21"
    var nightTemperature = "+5"
    var isTherePrecipitation = false

    fun printData() {
        println(
            """
            Прогноз погоды:
            Температура днем: $daytimeTemperature°C
            Температура ночью: $nightTemperature°C
            Наличие осадков: $isTherePrecipitation
            
        """.trimIndent()
        )
    }
}