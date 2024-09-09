package org.example.lesson_1_10.lesson4

fun main() {
    val trainingDay = 5
    val isEvenDay = trainingDay % 2 == 0

    val isHandsTraining = !isEvenDay
    val isPressTraining = !isEvenDay
    val isLegsTraining = isEvenDay
    val isBackTraining = isEvenDay

    println(
        "Упражнения для рук:    $isHandsTraining\n" +
        "Упражнения для ног:    $isLegsTraining\n" +
        "Упражнения для спины:  $isBackTraining\n" +
        "Упражнения для пресса: $isPressTraining")
}