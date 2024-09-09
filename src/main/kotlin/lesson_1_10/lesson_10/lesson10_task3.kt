package org.example.lesson10

fun main() {
    println("Задайте длину пароля:")
    val password = generatePassword(readln().toInt())
    println("Ваш пароль сгенерирован: $password")
}

fun generatePassword(passwordLength: Int): String {
    val numbersRange = 0..9
    val specialCharsRange = ' '..'/'

    var password = ""

    for (i in 1..passwordLength) {
        password += if (i % 2 == 0) specialCharsRange.random() else numbersRange.random()
    }

    return password
}