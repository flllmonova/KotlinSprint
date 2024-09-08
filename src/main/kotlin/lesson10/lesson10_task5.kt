package org.example.lesson10

const val USER_LOGIN = "log"
const val USER_PASSWORD = "pass"
const val TOKEN_LENGTH = 32

fun main() {
    println("Для входа в приложение введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    val token = logIn(login, password)

    if (token == null) {
        println("Неудачная авторизация")
        return
    } else println("Авторизация прошла успешно")

    val shoppingCart = getShoppingCart(token)
    println("\nСостав вашей корзины: \n$shoppingCart")
}

fun logIn(login: String, password: String): String? {
    return if ((login == USER_LOGIN) && (password == USER_PASSWORD)) return generateToken()
    else null
}

fun generateToken(): String {
    val upperCaseCharsRange = 'A'..'Z'
    val lowerCaseCharsRange = 'a'..'z'
    val numbersRange = 0..9
    val generalRange = upperCaseCharsRange + lowerCaseCharsRange + numbersRange
    var token = ""

    for (i in 1..TOKEN_LENGTH) {
        token += generalRange.random()
    }

    return token
}

fun getShoppingCart(token: String): List<String> {
    return listOf(
        "Шампунь для волос", "Бальзам для волос", "Сыворотка для лица"
    )
}