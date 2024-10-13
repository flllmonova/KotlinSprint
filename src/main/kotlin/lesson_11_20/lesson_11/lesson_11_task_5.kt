package org.example.lesson_11_20.lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("автор1")
    val user2 = forum.createNewUser("автор2")

    val messagesCount = 4

    for (i in 1..messagesCount) {
        println("Напишите сообщение:")
        val message = readln()
        forum.createNewMessage((if (i % 2 == 0) user2 else user1).userId, message)
    }

    forum.printThread()
}

class Forum {
    var idGenerator = 0
    val forumMembersList: MutableList<ForumMember> = mutableListOf()
    val messageHistory: MutableList<String> = mutableListOf()

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(++idGenerator, userName)
        forumMembersList.add(newUser)
        println("Пользователь $userName успешно зарегистрирован на форуме.")
        return newUser
    }

    fun createNewMessage(userId: Int, _message: String) {
        if (userId !in 1..idGenerator) {
            println("Вы не можете писать сообщения, так как не зарегистрированы на форуме.")
            return
        }

        val message = ForumMessage(userId, _message)
        forumMembersList.forEach { member: ForumMember ->
            if (message.authorId == member.userId) messageHistory.add("${member.userName}: ${message.message}")
        }
    }

    fun printThread() {
        println("\nВывод всех сообщений форума:")
        messageHistory.forEach { message: String ->
            println(message)
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)