package org.example.lesson_11_20.lesson_15

fun main() {
    val duck = org.example.lesson_11_20.lesson_15.Duck()
    val carp = org.example.lesson_11_20.lesson_15.Carp()
    val seagull = org.example.lesson_11_20.lesson_15.Seagull()

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

class Carp : org.example.lesson_11_20.lesson_15.Floating {
    val name = "Карась"
}

class Duck : org.example.lesson_11_20.lesson_15.Flying, org.example.lesson_11_20.lesson_15.Floating {
    val name = "Утка"
}

class Seagull : org.example.lesson_11_20.lesson_15.Flying, org.example.lesson_11_20.lesson_15.Floating {
    val name = "Чайка"
}