package org.example.lesson7

fun main() {
    val intRange = 1..9
    val charRange = 'a'..'z'
    val passwordLength = 6
    var password = ""

    for (i in 1..passwordLength) {
        password += if (i % 2 == 0) intRange.random() else charRange.random()
    }

    println(password)
}