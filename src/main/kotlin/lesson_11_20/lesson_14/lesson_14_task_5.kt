package org.example.lesson_11_20.lesson_14

open class Message(
    val author: String,
    val text: String,
    val id: Int,
)

class ChildMessage(
    author: String,
    text: String,
    id: Int,
    val parentMessageId: Int,
) : Message(author, text, id)

class Chat {
    var idGenerator = 0
    val messagesList: MutableList<Message> = mutableListOf()
    val threadMessagesList: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(_author: String, _message: String) {
        val message = Message(_author, _message, ++idGenerator)
        messagesList.add(message)
    }

    fun addThreadMessage(_author: String, _message: String, _parentMessageId: Int) {
        val threadMessage = ChildMessage(_author, _message, ++idGenerator, _parentMessageId)
        threadMessagesList.add(threadMessage)
    }

    fun printChat() {
        val groupedMessagesList = messagesList.groupBy({ it.id }) { "${it.author}: ${it.text}" }
        val groupedThreadMessagesList = threadMessagesList.groupBy({
            it.parentMessageId
        }) { "\t${it.author}: ${it.text}" }

        groupedMessagesList.forEach { message: Map.Entry<Int, List<String>> ->
            println(message.value.joinToString())

            val parentMessageId = message.key
            if (groupedThreadMessagesList.containsKey(parentMessageId)) {
                groupedThreadMessagesList[parentMessageId]?.forEach { childMessage: String ->
                    println(childMessage)
                }
            }
        }
    }
}