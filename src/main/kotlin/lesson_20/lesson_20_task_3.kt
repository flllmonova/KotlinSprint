package org.example.lesson_20

class Gamer(
    private val name: String,
    private val isKeyFound: Boolean,
) {

    fun getGamerName() = name

    fun getInfoAboutKey() = isKeyFound
}

val hasKey: (gamer: Gamer) -> Unit = { gamer: Gamer ->
    println(if (gamer.getInfoAboutKey()) "Игрок ${gamer.getGamerName()} открыл дверь" else "Дверь заперта")
}
