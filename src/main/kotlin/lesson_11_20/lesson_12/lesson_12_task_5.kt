package org.example.lesson_11_20.lesson_12

import kotlin.random.Random

const val NUMBER_DAYS_IN_MONTH = 30

fun main() {
    val weatherDataForMonthList: MutableList<org.example.lesson_11_20.lesson_12.WeatherDataDay> = mutableListOf()
    val temperatureRangeInSummer = 10..35

    for (i in 1..NUMBER_DAYS_IN_MONTH) {
        val weatherDataForDay = org.example.lesson_11_20.lesson_12.WeatherDataDay(
            temperatureRangeInSummer.random(),
            temperatureRangeInSummer.random(),
            Random.nextBoolean()
        )
        weatherDataForMonthList.add(weatherDataForDay)
    }

    val daytimeTemperaturesForMonthList = weatherDataForMonthList.map { day: org.example.lesson_11_20.lesson_12.WeatherDataDay ->
        day.daytimeTemperature
    }
    val nightTemperaturesForMonthList = weatherDataForMonthList.map { day: org.example.lesson_11_20.lesson_12.WeatherDataDay ->
        day.nightTemperature
    }
    val precipitationForMonthList = weatherDataForMonthList.map { day: org.example.lesson_11_20.lesson_12.WeatherDataDay ->
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