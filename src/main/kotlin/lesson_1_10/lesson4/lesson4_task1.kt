package org.example.lesson_1_10.lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val numberOfBookedTablesForToday = 13
    val numberOfBookedTablesForTomorrow = 9

    println(
        "[Доступность столиков на сегодня: ${numberOfBookedTablesForToday < org.example.lesson_1_10.lesson4.NUMBER_OF_TABLES}],\n" +
        "[Доступность столиков на завтра: ${numberOfBookedTablesForTomorrow < org.example.lesson_1_10.lesson4.NUMBER_OF_TABLES}].")
}