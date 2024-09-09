package org.example.lesson_1_10.lesson7

fun main() {

    val range = 1000..9999
    var pinCode = range.random()

    while (true) {
        println("Ваш код авторизации: $pinCode")
        println("Введите код, чтобы авторизоваться")

        if (readln().toInt() == pinCode) {
            println("Добро пожаловать!")
            break
        } else {
            pinCode = range.random()
            println("Код введен неверно. Вам отправлен новый код")
        }
    }
}
