package org.example.lesson_12

fun main() {
    val todayWeather = WeatherDataDay(25, 19, true)
    todayWeather.printData()
}

class WeatherDataDay(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
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