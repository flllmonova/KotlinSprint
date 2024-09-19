package org.example.lesson_12

import kotlin.random.Random

const val NUMBER_DAYS_IN_MONTH = 30

fun main() {
    val weatherDataForMonthList: MutableList<WeatherDataForDay> = mutableListOf()
    val temperatureRangeInSummer = 10..35

    for (i in 1..NUMBER_DAYS_IN_MONTH) {
        val weatherDataForDay = WeatherDataForDay(
            temperatureRangeInSummer.random(),
            temperatureRangeInSummer.random(),
            Random.nextBoolean()
        )
        weatherDataForMonthList.add(weatherDataForDay)
    }

    val daytimeTemperaturesForMonthList: MutableList<Int> = mutableListOf()
    val nightTemperaturesForMonthList: MutableList<Int> = mutableListOf()
    val precipitationForMonthList: MutableList<Boolean> = mutableListOf()

    weatherDataForMonthList.forEach { day: WeatherDataForDay ->
        daytimeTemperaturesForMonthList.add(day.daytimeTemperature)
        nightTemperaturesForMonthList.add(day.nightTemperature)
        precipitationForMonthList.add(day.isTherePrecipitation)
    }

    val averageValueOfDaytimeTemperaturesForMonth = daytimeTemperaturesForMonthList.average().toInt()
    val averageValueNightTemperaturesForMonth = nightTemperaturesForMonthList.average().toInt()

    var daysNumberWithPrecipitation = 0
    precipitationForMonthList.forEach { isTherePrecipitation: Boolean ->
        if (isTherePrecipitation) ++daysNumberWithPrecipitation
    }

    println(
        """
        Показатели за месяц
        Средняя температура днём: $averageValueOfDaytimeTemperaturesForMonth°C
        Средняя температура ночью: $averageValueNightTemperaturesForMonth°C
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