package org.example.lesson_16

class PlayingDice {

    private val number = (1..6).random()

    fun getNumber() {
        println(number)
    }
}