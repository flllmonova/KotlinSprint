package org.example.lesson7

fun main() {
    val rangeOfNumbers = '1'..'9'
    val rangeOfLowercaseLetters = 'a'..'z'
    val rangeOfUppercaseLetters = 'A'..'Z'
    val listOfRanges = listOf(rangeOfNumbers, rangeOfLowercaseLetters, rangeOfUppercaseLetters)

    val minPasswordLength = 6
    var password = ""
    println("Минимальная длина пароля: $minPasswordLength символов")
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()

    for (i in 1..passwordLength) {
        val randomRange = listOfRanges.random()
        password += randomRange.random()
    }

    println("Ваш пароль сгенерирован: $password")
}