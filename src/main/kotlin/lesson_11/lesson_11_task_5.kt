package org.example.lesson_11

fun main() {
    val forum = Forum()

    forum.createNewUser("Михаил")
    forum.createNewUser("Кирилл")

    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(1)
    forum.createNewMessage(2)

    forum.printThread()
}

class Forum {
    var idGenerator = 1
    val forumMembersList: MutableList<ForumMember> = mutableListOf()
    val messageHistory: MutableList<String> = mutableListOf()

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(idGenerator++, userName)
        forumMembersList.add(newUser)
        println("Пользователь $userName успешно зарегистрирован на форуме.")
        return newUser
    }

    fun createNewMessage(userId: Int) {
        if (userId !in 1..idGenerator) {
            println("Вы не зарегистрированы на форуме")
            return
        }

        println("Напишите сообщение:")
        val newMessage = ForumMessage(userId, readln())
        forumMembersList.forEach { member: ForumMember ->
            if (member.userId == userId) messageHistory.add("${member.userName}: ${newMessage.message}")
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