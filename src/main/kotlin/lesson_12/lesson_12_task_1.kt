package org.example.lesson_12

fun main() {

    val todayWeather = WeatherDataForOneDay()
    val tomorrowWeather = WeatherDataForOneDay()

    todayWeather.daytimeTemperature = 12
    todayWeather.nightTemperature = 4
    todayWeather.isTherePrecipitation = true

    tomorrowWeather.daytimeTemperature = 19
    tomorrowWeather.nightTemperature = 6
    tomorrowWeather.isTherePrecipitation = false

    todayWeather.printData()
    tomorrowWeather.printData()
}

class WeatherDataForOneDay {

    var daytimeTemperature = 21
    var nightTemperature = 5
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