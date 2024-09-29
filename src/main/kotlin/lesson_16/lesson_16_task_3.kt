package org.example.lesson_16

fun main() {
    val user1 = User("Standish")
    user1.setAndValidatePassword()
}

class User(
    private val name: String,
) {

    private var password = ""

    fun setAndValidatePassword() {
        println("Установите пароль:")
        password = readln()
        validatePassword(password)
    }

    private fun validatePassword(password: String) {
        val charsContOfRelevantPassword = 7
        println(
            if (password.length >= charsContOfRelevantPassword) "Пароль релевантен"
            else "Пароль не релевантен. Его длина должна быть не менее $charsContOfRelevantPassword символов"
        )
    }
}