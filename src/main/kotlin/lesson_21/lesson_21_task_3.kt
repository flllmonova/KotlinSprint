package org.example.lesson_21

fun Player.isHealthy(): Boolean {
    return getMaxHealth() == getCurrentHealth()
}

class Player(
    private val name: String,
    private val maxHealth: Int,
    private var currentHealth: Int,
) {
    fun getMaxHealth() = maxHealth

    fun getCurrentHealth() = currentHealth

    fun restoreHealth(valueHealth: Int) {
        currentHealth = valueHealth
    }
}