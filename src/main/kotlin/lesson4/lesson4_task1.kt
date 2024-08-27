package org.example.lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val numberOfBookedTablesForToday = 13
    val numberOfBookedTablesForTomorrow = 9

    println("[Доступность столиков на сегодня: ${numberOfBookedTablesForToday < NUMBER_OF_TABLES}],")
    println("[Доступность столиков на завтра: ${numberOfBookedTablesForTomorrow < NUMBER_OF_TABLES}].")
}