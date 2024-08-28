package org.example.lesson4

fun main() {
    val trainingDay = 5
    val isHandsTraining = trainingDay % 2 == 1
    val isPressTraining = trainingDay % 2 == 1
    val isLegsTraining = trainingDay % 2 == 0
    val isBackTraining = trainingDay % 2 == 0

    println(
        "Упражнения для рук:    $isHandsTraining\n" +
        "Упражнения для ног:    $isLegsTraining\n" +
        "Упражнения для спины:  $isBackTraining\n" +
        "Упражнения для пресса: $isPressTraining")
}