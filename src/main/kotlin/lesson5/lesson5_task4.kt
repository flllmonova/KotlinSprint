package org.example.lesson5

fun main() {

    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"

    println(
        """
        Добро пожаловать на Космический корабль "Heart of Gold"!
        Вас встречает робот-андройд Марвин.
        Введите, пожалуйста, ваш логин:
    """.trimIndent()
    )

    when (userLogin) {
        readLine()!! -> {
            println("Отлично, введите пароль:")
            when (userPassword) {
                readLine()!! -> println(
                    """
                    Ваши данные проверены и верны.
                    Пользователь "$userLogin", вам разрешено входить на борт корабля "Heart of Gold"!
                """.trimIndent()
                )

                else -> println("Пароль введен неверно.")
            }
        }

        else -> println("Вы не зарегистрированы в системе, желаете пройти регистрацию?")
    }
}