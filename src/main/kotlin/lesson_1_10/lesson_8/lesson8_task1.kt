package org.example.lesson8

fun main() {
    val viewsNumberOnMonday = 780
    val viewsNumberOnTuesday = 1080
    val viewsNumberOnWednesday = 510
    val viewsNumberOnThursday = 320
    val viewsNumberOnFriday = 880
    val viewsNumberOnSaturday = 200
    val viewsNumberOnSunday = 1500

    val viewsNumberForWeek = arrayOf(
        viewsNumberOnMonday, viewsNumberOnTuesday, viewsNumberOnWednesday, viewsNumberOnThursday,
        viewsNumberOnFriday, viewsNumberOnSaturday, viewsNumberOnSunday
    )

    println(viewsNumberForWeek.sum())
}