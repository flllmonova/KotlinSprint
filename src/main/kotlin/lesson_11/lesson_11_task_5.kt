package org.example.lesson_11

fun main() {
    val forum = Forum()

    forum.createNewUser("автор1")
    forum.createNewUser("автор2")

    forum.createNewMessage(ForumMessage(1))
    forum.createNewMessage(ForumMessage(2))
    forum.createNewMessage(ForumMessage(1))
    forum.createNewMessage(ForumMessage(2))

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

    fun createNewMessage(message: ForumMessage) {
        forumMembersList.forEach { member: ForumMember ->
            if (message.authorId ==  member.userId) messageHistory.add("${member.userName}: ${message.message}")
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
    val message: String = readln(),
)