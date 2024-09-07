package org.example.lesson10

const val MIN_VALUE_ON_DICE = 1
const val MAX_VALUE_ON_DICE = 6

fun main() {

    val humanName = "\"Пользователь\""
    val computerName = "\"Компьютер\""
    var humanResultOfDiceRoll: Int
    var computerResultOfDiceRoll: Int

    do {
        humanResultOfDiceRoll = rollDace()
        computerResultOfDiceRoll = rollDace()

        printResultOfDiceRoll(humanName, humanResultOfDiceRoll)
        printResultOfDiceRoll(computerName, computerResultOfDiceRoll)

        if (humanResultOfDiceRoll == computerResultOfDiceRoll) {
            println("Количество очков оказалось равным. Проведем еще один раунд\n")
        } else break

    } while (true)

    if (humanResultOfDiceRoll > computerResultOfDiceRoll) println("\nПобедило человечество")
    else println("\nПобедила машина")
}

fun rollDace(): Int =
    (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random() + (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random()

fun printResultOfDiceRoll(playerName: String, playerResult: Int) {
    println("Игрок $playerName бросает кости, количество очков: $playerResult")
}