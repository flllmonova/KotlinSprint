package org.example.lesson_11

fun main() {

    val user1 = User(
        1, "BlackWood", "lb900", "lordblackwood@gmail.com"
    )
    val user2 = User(
        2, "Standish", "ts900", "tomstandish@mail.ru"
    )

    user1.printUserData(user1.userId, user1.userLogin, user1.userPassword, user1.userEmail)
    user2.printUserData(user2.userId, user2.userLogin, user2.userPassword, user2.userEmail)
}

class User(
    val userId: Int,
    val userLogin: String,
    val userPassword: String,
    val userEmail: String,
) {
    fun printUserData(userId: Int, userLogin: String, userPassword: String, userEmail: String) {
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