package org.example.lesson_11_20.lesson_19

fun main() {
    val fishesList = Fish.entries.map { it.fishName }
    println("Вы можете добавить в свой аквариум следующих рыбок:\n$fishesList")
}

enum class Fish(val fishName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}