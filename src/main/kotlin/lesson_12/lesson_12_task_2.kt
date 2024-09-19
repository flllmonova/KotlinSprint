package org.example.lesson_12

fun main() {
    val todayWeather = WeatherDataForDay("+25", "+19", true)
    todayWeather.printData()
}

class WeatherDataForDay(
    val daytimeTemperature: String,
    val nightTemperature: String,
    val isTherePrecipitation: Boolean,
) {
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