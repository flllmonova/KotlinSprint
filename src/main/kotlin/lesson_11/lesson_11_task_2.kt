package org.example.lesson_11

fun main() {
    val user = User2(2, "Standish", "900", "tomstandish@mail.ru")
    user.addBio()
    user.changePassword()
    user.printUserData()
}

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = "",
) {

    fun printUserData() {
        println(
            """
        Данные пользователя:
        id: $id
        Логин: $login
        Пароль: $password
        Почта: $email
        ${bio.ifEmpty { "" }}
    """.trimIndent()
        )
    }

    fun addBio() {
        println("Заполните информацию \"о себе\":")
        bio = readln()
        println("Информация добавлена\n")
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        if (readln() == password) {
            println("Напишите новый пароль:")
            password = readln()
            println("Пароль успешно изменен\n")
        } else {
            println("Пароль введен неверно\n")
        }
    }
}