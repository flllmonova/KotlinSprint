package org.example.lesson_16

fun main() {
    val user1 = User("Standish")
    user1.setPassword()
    validatePassword(user1.getPassword())
}

class User(
    private val name: String,
) {

    private var password = ""

    fun setPassword() {
        println("Установите пароль:")
        password = readln()
    }

    fun getPassword(): String = password
}

fun validatePassword(password: String) {
    val charsContOfRelevantPassword = 7
    println(
        if (password.length >= charsContOfRelevantPassword) "Пароль релевантен"
        else "Пароль не релевантен. Его длина должна быть не менее $charsContOfRelevantPassword символов"
    )
}