package org.example.lesson_11

fun main() {

    val user1 = User(
        1, "BlackWood", "lb900", "lordblackwood@gmail.com"
    )
    val user2 = User(
        2, "Standish", "ts900", "tomstandish@mail.ru"
    )

    user1.printUserData()
    user2.printUserData()
}

class User(
    val userId: Int,
    val userLogin: String,
    val userPassword: String,
    val userEmail: String,
) {

    fun printUserData() {
        println(
            """
        Данные пользователя:
        id: $userId
        Логин: $userLogin
        Пароль: $userPassword
        Почта: $userEmail   
    """.trimIndent()
        )
    }
}