package org.example.lesson_1_10.lesson10

const val MIN_LENGTH_OF_LOGIN_AND_PASSWORD = 4

fun main() {

    var login = setLogin()
    var password = setPassword()

    while (!checkLoginAndPasswordIsRightLength(login, password)) {
        println("Логин или пароль недостаточно длинные")
        login = setLogin()
        password = setPassword()
    }

    println("Добро пожаловать!")
}

fun setLogin(): String {
    println("Введите логин:")
    return readln()
}

fun setPassword(): String {
    println("Введите пароль:")
    return readln()
}

fun checkLoginAndPasswordIsRightLength(login: String, password: String): Boolean {
    return (login.length >= MIN_LENGTH_OF_LOGIN_AND_PASSWORD) && (password.length >= MIN_LENGTH_OF_LOGIN_AND_PASSWORD)
}