package org.example.lesson1

fun main() {
    val numberOfSecondsPerMinute: Byte = 60
    val numberOfMinutesPerHour: Byte = 60

    val seconds: Short = 6480
    val minutes: Short = (seconds / numberOfSecondsPerMinute).toShort()
    val remainingSeconds: Short = (seconds % numberOfSecondsPerMinute).toShort()
    val hours: Short = (minutes / numberOfMinutesPerHour).toShort()
    val remainingMinutes: Short = (minutes % numberOfMinutesPerHour).toShort()

    val firstTwoDigitNumber: Byte = 10
    val formattedHours: String = if (hours < firstTwoDigitNumber) "0$hours" else "$hours"
    val formattedMinutes: String = if (remainingMinutes < firstTwoDigitNumber) "0$remainingMinutes" else "$remainingMinutes"
    val formattedSeconds: String = if (remainingSeconds < firstTwoDigitNumber) "0$remainingSeconds" else "$remainingSeconds"

    println(String.format("%s:%s:%s", formattedHours, formattedMinutes, formattedSeconds))
}