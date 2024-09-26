package org.example.lesson_15

fun main() {
    val temperatureOfDay = Temperature(25, 19)
    val precipitationAmountOfDay = PrecipitationAmount(6)
    val weatherServer = WeatherServer()

    weatherServer.sendData(temperatureOfDay)
    weatherServer.sendData(precipitationAmountOfDay)
}

abstract class WeatherStationStats {
}

class Temperature(
    val dayTemperature: Int,
    val nightTemperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer {
    fun sendData(data: WeatherStationStats) {
        println(
            when (data::class.simpleName) {
                "Temperature" -> "Данные о температуре"
                "PrecipitationAmount" -> "Данные об осадках"
                else -> "Данные не распознаны и не"
            } + " отправлены на сервер."
        )
    }
}