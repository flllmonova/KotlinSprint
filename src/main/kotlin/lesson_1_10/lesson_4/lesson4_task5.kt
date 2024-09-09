package org.example.lesson4

const val IS_THERE_DAMAGE_OF_SHIP = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_PROVISIONS_BOXES = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {
    println("Корабль имеет повреждения корпуса? [true / false]")
    val isShipDamaged = readln().toBoolean()

    println("Сколько человек в экипаже?")
    val numberOfCrew = readln().toInt()

    println("Сколько есть ящиков провизии?")
    val numberOfProvisionBoxes = readln().toInt()

    println("Погода благоприятна для плавания? [true / false]")
    val isWeatherFavorable = readln().toBoolean()

    println(
        "Возможность отправить корабль в плавание: ${
        (isShipDamaged == IS_THERE_DAMAGE_OF_SHIP) &&
        (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW) &&
        (numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISIONS_BOXES)
        ||
        (numberOfCrew == MAX_NUMBER_OF_CREW) &&
        (isWeatherFavorable == IS_WEATHER_FAVORABLE) &&
        (numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISIONS_BOXES)}"
    )
}