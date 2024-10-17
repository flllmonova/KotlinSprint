package org.example.lesson_22

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val alphaCentaur = GalacticGuide(
        "Альфа Центавра, Порт Браста",
        "Главный космопорт с огромным торговым центром беспошлинной торговли",
        LocalDateTime.of(2083, Month.MARCH, 14, 17, 0),
        4.37f
    )

    alphaCentaur.run {
        println(component1())
        println(component2())
        println(component3())
        println(component4())
    }
}

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateAndTimeOfEvent: LocalDateTime,
    val distanceOfPlaceOrEventFromEarthInLightYears: Float,
)