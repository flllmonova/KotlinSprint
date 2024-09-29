package org.example.lesson_16

fun main() {
    val player1 = Player("Aeqepth", 5)
    val player2 = Player("Itra", 50)

    player1.hit(player2)

    player2.hit(player1)

    player1.run {
        hit(player2)
        hit(player2)
        hit(player2)
        restoreHealth()
    }

    player2.run {
        hit(player1)
        hit(player1)
        restoreHealth()
    }
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

    fun hit(enemy: Player) {
        enemy.health -= hitForce
        println("Игрок $name нанес урон игроку ${enemy.name} -$hitForce")

        if (enemy.health <= 0) {
            println("Игрок ${enemy.name} умер")
            die(enemy)
        }
    }

    fun restoreHealth() {
        if (health == 0) {
            println("Восстановление здоровья невозможно")
            return
        }

        health = fullHealthLevel
        println("Игрок $name восстановил здоровье")
    }

    private fun die(player: Player) {
        player.health = 0
        player.hitForce = 0
    }
}