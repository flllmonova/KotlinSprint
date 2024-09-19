package org.example.lesson_12

fun main() {

    val weatherForToday = WeatherDataForOneDay()
    val weatherForTomorrow = WeatherDataForOneDay()

    weatherForToday.daytimeTemperature = "+12"
    weatherForToday.nightTemperature = "+4"
    weatherForToday.isTherePrecipitation = true

    weatherForTomorrow.daytimeTemperature = "+19"
    weatherForTomorrow.nightTemperature = "+6"
    weatherForTomorrow.isTherePrecipitation = false

    weatherForToday.printData()
    weatherForTomorrow.printData()
}

class WeatherDataForOneDay {

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