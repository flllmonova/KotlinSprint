package org.example.lesson10

const val MIN_VALUE_ON_DICE = 1
const val MAX_VALUE_ON_DICE = 6

fun main() {

    val humanName = "\"Пользователь\""
    val computerName = "\"Компьютер\""
    var humanResultOfDiceRoll = rollDace()
    var computerResultOfDiceRoll = rollDace()

    printResultOfDiceRoll(humanName, humanResultOfDiceRoll)
    printResultOfDiceRoll(computerName, computerResultOfDiceRoll)

    while (humanResultOfDiceRoll == computerResultOfDiceRoll) {
        println(
            """

            Количество очков у игроков $computerName и $humanName оказалось равным
            Проведем еще один раунд

        """.trimIndent()
        )

        humanResultOfDiceRoll = rollDace()
        computerResultOfDiceRoll = rollDace()

        printResultOfDiceRoll(humanName, humanResultOfDiceRoll)
        printResultOfDiceRoll(computerName, computerResultOfDiceRoll)
    }

    if (humanResultOfDiceRoll > computerResultOfDiceRoll) println("\nПобедило человечество")
    else println("\nПобедила машина")
}

fun rollDace(): Int =
    (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random() + (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random()

fun printResultOfDiceRoll(playerName: String, playerResult: Int) {
    println("Игрок $playerName бросает кость, количество очков: $playerResult")
}