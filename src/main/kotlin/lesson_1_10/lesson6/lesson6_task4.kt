package org.example.lesson_1_10.lesson6

fun main() {

    val initialNumberOfInterval = 1
    val finalNumberOfInterval = 9
    var numberOfAttempts = 5
    val winningNumber = (initialNumberOfInterval..finalNumberOfInterval).random()

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