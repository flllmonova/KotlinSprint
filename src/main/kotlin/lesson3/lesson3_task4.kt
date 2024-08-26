package org.example.lesson3

fun main() {
    var startingPoint = "E2"
    var finalPoint = "E4"
    var moveNumber = 1
    var playerMove = "$startingPoint-$finalPoint;$moveNumber"

    println(playerMove)

    startingPoint = "D2"
    finalPoint = "D3"
    moveNumber = 2
    playerMove = "$startingPoint-$finalPoint;$moveNumber"

    println(playerMove)
}