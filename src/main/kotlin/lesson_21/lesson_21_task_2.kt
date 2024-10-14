package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}