package org.example.lesson6

fun main() {

    println("Для создания профиля введите логин:")
    val userLogin = readln()
    println("Придумайте пароль:")
    val userPassword = readln()

    println("Ваш профиль создан!")

    while (true) {
        println("Для входа в приложение введите логин:")
        val authorizationLogin = readln()
        println("Введите пароль:")
        val authorizationPassword = readln()

        if ((authorizationLogin == userLogin) && (authorizationPassword == userPassword)) {
            println("Авторизация прошла успешно")
            break
        } else println("Данные неверны")
    }
}