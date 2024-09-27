package org.example.lesson_15

fun main() {
    val duck = Duck()
    val carp = Carp()
    val seagull = Seagull()

    with(carp) {
        println(name)
        swim()
    }
    println()

    with(duck) {
        println(name)
        fly()
        swim()
    }
    println()

    with(seagull) {
        println(name)
        fly()
        swim()
    }
}

interface Floating {
    fun swim() {
        println("плавает")
    }
}

interface Flying {
    fun fly() {
        println("летает")
    }
}

class Carp : Floating {
    val name = "Карась"
}

class Duck : Flying, Floating {
    val name = "Утка"
}

class Seagull : Flying, Floating {
    val name = "Чайка"
}