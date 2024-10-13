package org.example.lesson_11_20.lesson_20

fun main() {

    val congratulateWithHappyNewYear: (username: String) -> String = { "С наступающим Новым Годом, $it!" }

    println(congratulateWithHappyNewYear("Михаил"))
}