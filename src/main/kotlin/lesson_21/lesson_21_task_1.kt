package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiouy"
    var counter = 0

    for (char in this) {
        if (char in vowels) counter++
    }

    return counter
}