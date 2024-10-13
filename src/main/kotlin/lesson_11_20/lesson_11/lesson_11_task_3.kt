package org.example.lesson_11_20.lesson_11

fun main() {
    val divingRoom = Room("images/covers/divers", "Дайвинг")
}

class Room(
    val cover: String,
    val name: String,
    val participantList: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(newParticipant: Participant) {
        participantList.add(newParticipant)
        println("Добавлен участник ${newParticipant.nickname}")
    }

    fun pressOnParticipantAvatar(newParticipant: Participant) {
        println("Участник ${newParticipant.nickname}")
        println("статус: ${newParticipant.status}")
    }

    fun changeParticipantStatus(participant: Participant, newStatus: String) {
        participant.status = newStatus
    }
}

class Participant(
    val avatar: String,
    val nickname: String,
    var status: String = "микрофон выключен",
)