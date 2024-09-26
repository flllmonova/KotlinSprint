package org.example.lesson_15

abstract class ForumMember {
    abstract val name: String
    abstract fun readForum()
    abstract fun writeMessage()
}

class User(
    override val name: String,
) : ForumMember() {

    override fun readForum() {
        println("$name читает форум")
    }

    override fun writeMessage() {
        println("$name пишет сообщение")
    }
}

class Admin(
    override val name: String,
) : ForumMember() {

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