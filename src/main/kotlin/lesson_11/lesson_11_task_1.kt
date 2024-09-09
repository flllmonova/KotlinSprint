package org.example.lesson_11

fun main() {

    val user1 = User(
        1, "BlackWood", "lb900", "lordblackwood@gmail.com"
    )
    val user2 = User(
        2, "Standish", "ts900", "tomstandish@mail.ru"
    )

    println(
        """
        Данные пользователя:
        id: ${user1.userId}
        Логин: ${user1.userLogin}
        Пароль: ${user1.userPassword}
        Почта: ${user1.userEmail}
        
    """.trimIndent()
    )
    println(
        """
        Данные пользователя:
        id: ${user2.userId}
        Логин: ${user2.userLogin}
        Пароль: ${user2.userPassword}
        Почта: ${user2.userEmail}   
    """.trimIndent()
    )
}

class User(
    val userId: Int,
    val userLogin: String,
    val userPassword: String,
    val userEmail: String
)