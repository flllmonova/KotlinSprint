package org.example.lesson6

import kotlin.random.Random

fun main() {

    val initialNumberOfInterval = 1
    var finalNumberOfInterval = 10
    var numberOfAttempts = 5
    val winningNumber = Random.nextInt(initialNumberOfInterval, finalNumberOfInterval--)

    println("Угадайте число от $initialNumberOfInterval до $finalNumberOfInterval")

    while (numberOfAttempts-- > 0) {
        val number = readln().toInt()
        if (number == winningNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            if (numberOfAttempts == 0) {
                println(
                    """
                    Попытки закончились
                    Было загадано число $winningNumber
                """.trimIndent()
                )
                break
            }
            println(
                """
                Неверно
                Оставшиеся попытки: $numberOfAttempts
            """.trimIndent()
            )
        }
    }
}