package org.example.lesson_12

const val NUMBER_OF_CELSIUS_DEGREES = 273.15

fun main() {
    val todayWeather = DataOfWeather(300, 295, false)
    todayWeather.printData()
}

class DataOfWeather(
    daytimeTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    _isTherePrecipitation: Boolean,
) {

    val daytimeTemperatureInCelsius =
        (daytimeTemperatureInKelvin - NUMBER_OF_CELSIUS_DEGREES).toInt()
    val nightTemperatureInCelsius =
        (nightTemperatureInKelvin - NUMBER_OF_CELSIUS_DEGREES).toInt()
    val isTherePrecipitation = _isTherePrecipitation

    fun printData() {
        println(
            """
            Прогноз погоды:
            Температура днем: $daytimeTemperatureInCelsius°C
            Температура ночью: $nightTemperatureInCelsius°C
            Наличие осадков: $isTherePrecipitation         
        """.trimIndent()
        )
    }
}