package org.example.lesson_15

fun main() {
    val duck = Duck()
    val carp = Carp()
    val seagull = Seagull()

    println(carp.name)
    carp.swim()
    println()

    println(duck.name)
    duck.fly()
    duck.swim()
    println()

    println(seagull.name)
    seagull.fly()
    seagull.swim()
}

interface Floating {
    fun swim() {
        println("плавает")
    }
}

interface Flying {
    fun fly()  {
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