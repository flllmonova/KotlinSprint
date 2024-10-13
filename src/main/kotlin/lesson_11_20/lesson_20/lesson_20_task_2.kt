package org.example.lesson_11_20.lesson_20

fun main() {
    val player = Player("Bruno", 50, 100)
    healingPotion(player)
}

class Player(
    private val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int,
) {
    fun restoreCurrentHealth(valueHealth: Int) {
        currentHealth = valueHealth
    }

    fun getMaxHealth() = maxHealth
}

val healingPotion: (player: Player) -> Unit = { it.restoreCurrentHealth(it.getMaxHealth()) }