package org.example.lesson10

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