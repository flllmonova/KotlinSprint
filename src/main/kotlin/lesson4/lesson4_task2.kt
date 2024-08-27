package org.example.lesson4

const val MINIMUM_WEIGHT_OF_CATEGORY_AVERAGE = 35
const val MAXIMUM_WEIGHT_OF_CATEGORY_AVERAGE = 100
const val MAXIMUM_VOLUME_OF_CATEGORY_AVERAGE = 100

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println(
        "Груз с весом $cargoWeight кг и " +
        "объемом $cargoVolume л соответствует категории 'Average': " +
        "${(cargoWeight > MINIMUM_WEIGHT_OF_CATEGORY_AVERAGE) && (cargoWeight <= MAXIMUM_WEIGHT_OF_CATEGORY_AVERAGE) && (cargoVolume < MAXIMUM_VOLUME_OF_CATEGORY_AVERAGE)}")

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и " +
        "объемом $cargoVolume л соответствует категории 'Average': " +
        "${(cargoWeight > MINIMUM_WEIGHT_OF_CATEGORY_AVERAGE) && (cargoWeight <= MAXIMUM_WEIGHT_OF_CATEGORY_AVERAGE) && (cargoVolume < MAXIMUM_VOLUME_OF_CATEGORY_AVERAGE)}")
}