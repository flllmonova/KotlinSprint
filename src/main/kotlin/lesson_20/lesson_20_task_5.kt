package org.example.lesson_20

fun main() {
    val robot = Robot()

    robot.run {
        say()
        setModifier { it.reversed() }
        say()
    }
}

class Robot {

    private val phrases = listOf(
        "Доброе утро :)",
        "Добрый день",
        "Добрый вечер!",
        "Время чаепития!",
        "Настанет час мечты",
    )

    private var modifier: (String) -> String = { it }

    private fun getRandomPhrase() = phrases[phrases.indices.random()]

    fun say() = println(modifier(getRandomPhrase()))

    fun setModifier(_modifier: (String) -> String) { modifier = _modifier }
}