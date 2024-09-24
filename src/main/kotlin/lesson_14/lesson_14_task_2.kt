package org.example.lesson_14

import java.text.DecimalFormat

fun main() {
    listOf(ShipLiner(), Cargo(), Icebreaker()).forEach { ship: ShipLiner ->
        ship.printShipData()
    }
}

open class ShipLiner(
    val name: String = "Лайнер",
    val speed: Int = 56,
    val passengerCapacity: Int = 6_800,
    val loadCapacity: Int = 200_000,
) {
    open fun loadCargo() {
        println("Выдвинуть горизонтальный трап со шкафута")
    }

    open fun printShipData() {
        println(
            """
            Данные судна:
            Название: $name
            Скорость: $speed км/ч
            Пассажировместимость: ${thousandsSeparator(passengerCapacity)} чел.
            Грузоподъемность: ${thousandsSeparator(loadCapacity)} т
            
        """.trimIndent()
        )
    }
}

class Cargo : ShipLiner(
    name = "Грузовой корабль",
    speed = 35,
    passengerCapacity = 25,
    loadCapacity = 500_000,
) {
    override fun loadCargo() {
        println("Активировать погрузочный кран")
    }
}

class Icebreaker : ShipLiner(
    name = "Ледокол",
    speed = 25,
    passengerCapacity = 128,
    loadCapacity = 21_000
) {
    override fun loadCargo() {
        println("Открыть ворота со стороны кормы")
    }
    fun splitIce() {
        println("Расколоть лед")
    }
}

fun thousandsSeparator(number: Int): String = DecimalFormat("#,###").format(number)