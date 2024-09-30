package org.example.lesson_16

fun main() {
    val user1 = User("Standish")
    user1.setPassword()

    println("Введите пароль снова:")
    println("Валидность пароля: ${user1.validatePassword(readln())}")
}

class User(
    val login: String,
) {

    private var password = ""

    fun setPassword() {
        println("Установите пароль:")
        password = readln()
    }

    fun validatePassword(_password: String): Boolean {
        return _password == password
    }
}