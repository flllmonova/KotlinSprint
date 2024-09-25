package org.example.lesson_14

open class Message(
    val author: String,
    val text: String,
    val id: Int,
) {
    open fun printMessage() {
        println("$author: $text")
    }
}

class ChildMessage(
    author: String,
    text: String,
    id: Int,
    val parentMessageId: Int,
) : Message(author, text, id) {

    override fun printMessage() {
        println("\t$author: $text")
    }
}

class Chat {
    var idGenerator = 0
    val messagesList: MutableList<Message> = mutableListOf()

    fun addMessage(_author: String, _message: String) {
        val message = Message(_author, _message, ++idGenerator)
        messagesList.add(message)
    }

    fun addThreadMessage(_author: String, _message: String, _parentMessageId: Int) {
        val threadMessage = ChildMessage(_author, _message, ++idGenerator, _parentMessageId)
        messagesList.add(threadMessage)
    }

    fun printChat() {
        messagesList.forEach { message: Message ->
            message.printMessage()
        }
    }

    fun groupBy() {

    }
}