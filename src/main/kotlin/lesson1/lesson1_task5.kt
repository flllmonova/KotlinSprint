package org.example.lesson1

fun main() {
    val seconds: Short = 6480
    val minutes: Short = (seconds / 60).toShort()
    val remainingSeconds: Short = (seconds % 60).toShort()
    val hours: Short = (minutes / 60).toShort()
    val remainingMinutes: Short = (minutes % 60).toShort()

    println("0$hours:$remainingMinutes:0$remainingSeconds")
}