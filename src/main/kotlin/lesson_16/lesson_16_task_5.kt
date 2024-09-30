package org.example.lesson_16

fun main() {
    val player1 = Player("Aeqepth", 5)
    val player2 = Player("Itra", 50)

    player2.getDamaged(player1.hit())

    player1.getDamaged(player2.hit())
    player1.restoreHealth()
    player1.getDamaged(player2.hit())
    player1.getDamaged(player2.hit())

    player2.restoreHealth()
}

class Player(
    val name: String,
    private var hitForce: Int,
) {
    private val fullHealthLevel = 100
    private var health = fullHealthLevel

    init {
        println("Создан игрок $name")
    }

    fun getDamaged(enemyHit: Int) {
        health -= enemyHit
        println("Игроку $name нанесен урон -$enemyHit")

        if (health <= 0) {
            println("Игрок ${name} умер")
            die()
        }
    }

    fun hit(): Int = hitForce

    fun restoreHealth() {
        if (health == 0) {
            println("Восстановление здоровья для игрока $name невозможно")
            return
        }

        health = fullHealthLevel
        println("Игрок $name восстановил здоровье")
    }

    private fun die() {
        health = 0
        hitForce = 0
    }
}