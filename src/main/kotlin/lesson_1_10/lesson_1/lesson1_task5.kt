package org.example.lesson_1_10.lesson_1

const val NUMBER_OF_SECONDS_PER_MINUTE: Byte = 60
const val NUMBER_OF_MINUTES_PER_HOUR: Byte = 60

fun main() {
    val seconds: Short = 6480
    val minutes: Short = (seconds / NUMBER_OF_SECONDS_PER_MINUTE).toShort()
    val remainingSeconds: Short = (seconds % NUMBER_OF_SECONDS_PER_MINUTE).toShort()
    val hours: Short = (minutes / NUMBER_OF_MINUTES_PER_HOUR).toShort()
    val remainingMinutes: Short = (minutes % NUMBER_OF_MINUTES_PER_HOUR).toShort()

    val timeInSpace: String = "%02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds)
    println(timeInSpace)
}