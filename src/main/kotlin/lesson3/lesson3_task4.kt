package org.example.lesson3

fun main() {
    var startPoint = "E2"
    var finalPoint = "E4"
    var moveNumber = 1
    var playerMove = "$startPoint-$finalPoint;$moveNumber"

    println(playerMove)

    startPoint = "D2"
    finalPoint = "D3"
    moveNumber = 2
    playerMove = "$startPoint-$finalPoint;$moveNumber"

    println(playerMove)
}