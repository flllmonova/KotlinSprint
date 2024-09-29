package org.example.lesson_16

fun main() {
    val user1 = User("Standish")
    user1.setPassword()

}

class User(
    val login: String,
) {

    private var password = ""

    fun setPassword() {
        println("Установите пароль:")
        password = readln()
    }

    fun validatePassword(_password: String) {
        if (password == _password) println("Пароль введен верно")
        else println("Пароль введен не верно")
    }
}