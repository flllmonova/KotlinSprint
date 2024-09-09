package org.example.lesson_1_10.lesson7

const val MIN_CHARS_COUNT = 6

fun main() {
    val rangeOfNumbers = 0..9
    val rangeOfUppercaseLetters = 'A'..'Z'
    val rangeOfLowercaseLetters = 'a'..'z'
    val generalRange = rangeOfUppercaseLetters + rangeOfLowercaseLetters + rangeOfNumbers
    var password = ""

    println("Задайте длину пароля, не меньше $MIN_CHARS_COUNT символов")
    var passwordLength = readln().toInt()

    while (passwordLength < MIN_CHARS_COUNT) {
        println("Слишком короткий пароль. Введите длину снова")
        passwordLength = readln().toInt()
    }

    for (i in 1..passwordLength) {
        password += generalRange.random()
    }

    println("Ваш пароль сгенерирован: $password")
}