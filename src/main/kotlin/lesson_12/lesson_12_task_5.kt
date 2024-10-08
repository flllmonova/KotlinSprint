package org.example.lesson_12

import kotlin.random.Random

const val NUMBER_DAYS_IN_MONTH = 30

fun main() {
    val weatherDataForMonthList: MutableList<WeatherDataDay> = mutableListOf()
    val temperatureRangeInSummer = 10..35

    for (i in 1..NUMBER_DAYS_IN_MONTH) {
        val weatherDataForDay = WeatherDataDay(
            temperatureRangeInSummer.random(),
            temperatureRangeInSummer.random(),
            Random.nextBoolean()
        )
        weatherDataForMonthList.add(weatherDataForDay)
    }

    val daytimeTemperaturesForMonthList = weatherDataForMonthList.map { day: WeatherDataDay ->
        day.daytimeTemperature
    }
    val nightTemperaturesForMonthList = weatherDataForMonthList.map { day: WeatherDataDay ->
        day.nightTemperature
    }
    val precipitationForMonthList = weatherDataForMonthList.map { day: WeatherDataDay ->
        day.isTherePrecipitation
    }

    val averageDaytimeTemperatureForMonth = daytimeTemperaturesForMonthList.average().toInt()
    val averageNightTemperatureForMonth = nightTemperaturesForMonthList.average().toInt()

    val daysNumberWithPrecipitation = precipitationForMonthList.count { it }

    println(
        """
        Показатели за месяц
        Средняя температура днём: $averageDaytimeTemperatureForMonth°C
        Средняя температура ночью: $averageNightTemperatureForMonth°C
        Количество дней с осадками: $daysNumberWithPrecipitation
    """.trimIndent()
    )
}

class WeatherDataForDay(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val isTherePrecipitation: Boolean,
) {
    fun printData() {
        println(
            """
            Прогноз погоды:
            Температура днём: $daytimeTemperature°C
            Температура ночью: $nightTemperature°C
            Наличие осадков: $isTherePrecipitation
            
        """.trimIndent()
        )
    }
}