package org.example.lesson_11_20.lesson_15

abstract class ForumMember(
    val name: String,
    val id: Int,
) {
    abstract fun readForum()
    abstract fun writeMessage()
}

class User(
    name: String,
    id: Int,
) : ForumMember(name, id) {

    override fun readForum() {
        println("$name читает форум")
    }

    override fun writeMessage() {
        println("$name пишет сообщение")
    }
}

class Admin(
    name: String,
    id: Int,
) : ForumMember(name, id) {

    override fun readForum() {
        println("Администратор $name читает форум")
    }

    override fun writeMessage() {
        println("Администратор $name пишет сообщение")
    }

    fun deleteMessage() {
        println("Сообщение удалено")
    }

    fun deleteUser() {
        println("Администратор $name удалил пользователя")
    }
}