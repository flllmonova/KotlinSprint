package org.example.lesson_16

fun main() {
    val player1 = Player("Aeqepth", 5)
    val player2 = Player("Itra", 50)

    player1.run {
        getDamaged(player2.hit())
        restoreHealth()
        getDamaged(player2.hit())
        getDamaged(player2.hit())
        getDamaged(player2.hit())
        restoreHealth()
    }
}

class Player(
    val name: String,
    private var hitForce: Int,
) {
    private val fullHealthLevel = 100
    private var health = fullHealthLevel
    private var isDied = false

    init {
        println("Создан игрок $name")
    }

    fun hit(): Int = hitForce

    fun getDamaged(enemyHit: Int) {
        if (isDied) {
            println("Нанести удар игроку $name невозможно, игрок умер")
            return
        }

        health -= enemyHit
        println("Игроку $name нанесен урон -$enemyHit")

        if (health <= 0) {
            println("Игрок $name умер")
            die()
        }
    }

    fun restoreHealth() {
        if (isDied) {
            println("Восстановление здоровья для игрока $name невозможно")
            return
        }

        health = fullHealthLevel
        println("Игрок $name восстановил здоровье")
    }

    private fun die() {
        health = 0
        hitForce = 0
        isDied = true
    }
}