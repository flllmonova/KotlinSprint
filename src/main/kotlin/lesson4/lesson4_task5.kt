package org.example.lesson4

const val PRESENCE_OF_SHIP_DAMAGE = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_PROVISIONS_BOXES = 50
const val FAVORABLE_WEATHER = true

fun main() {
    val isShipDamaged = false
    val numberOfCrew = 70
    val numberOfProvisionBoxes = 51
    val isWeatherFavorable = false

    println(
        "Возможность отправить корабль в плавание: ${
        (PRESENCE_OF_SHIP_DAMAGE == isShipDamaged) &&
        (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW) &&
        (numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISIONS_BOXES)
        ||
        (numberOfCrew == MAX_NUMBER_OF_CREW) &&
        (isWeatherFavorable == FAVORABLE_WEATHER) &&
        (numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISIONS_BOXES)}"
    )
}