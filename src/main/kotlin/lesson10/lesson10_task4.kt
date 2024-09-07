package org.example.lesson10

const val MIN_VALUE_ON_DICE = 1
const val MAX_VALUE_ON_DICE = 6

fun main() {
    val humanName = "\"Пользователь\""
    val computerName = "\"Компьютер\""
    var numberOfWinningsGamesOfHuman = 0

    do {
        val winnerName = conductRoundAndGetWinnerName(humanName, computerName)
        if (humanName == winnerName) ++numberOfWinningsGamesOfHuman

        println("\nХотите бросить кости еще раз? Введите Да или Нет")

    } while (readln().trim().equals("Да", ignoreCase = true))

    println("Число выигранных партий игроком $humanName: $numberOfWinningsGamesOfHuman")
}

fun conductRoundAndGetWinnerName(firstPlayerName: String, secondPlayerName: String): String {
    var winnerName = ""

    do {
        val firstPlayerResult = rollDace()
        val secondPlayerResult = rollDace()

        printResultOfDiceRoll(firstPlayerName, firstPlayerResult)
        printResultOfDiceRoll(secondPlayerName, secondPlayerResult)

        if (firstPlayerResult == secondPlayerResult) {
            println("Количество очков оказалось равным. Проведем еще один раунд\n")
        } else {
            winnerName = if (firstPlayerResult > secondPlayerResult) firstPlayerName else secondPlayerName
            println("Победу одержал игрок $winnerName")
        }
    } while (firstPlayerResult == secondPlayerResult)

    return winnerName
}

fun rollDace(): Int = (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random() + (MIN_VALUE_ON_DICE..MAX_VALUE_ON_DICE).random()

fun printResultOfDiceRoll(playerName: String, playerResult: Int) {
    println("Игрок $playerName бросает кости, количество очков: $playerResult")
}