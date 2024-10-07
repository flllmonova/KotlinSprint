package org.example.lesson_19

fun main() {
    val tank1 = Tank(
        "КВ-1с",
        75,
        60,
        43,
        43,
        5,
        listOf("76.2 мм пушка ЗИС-5", "7.62 мм пулемёт ДТ"),
    )

    val tank2 = Tank(
        "PZ.KPFW-V PANTER",
        100,
        80,
        43,
        46,
        5,
        listOf("75 мм пушка wK-42", "7.92 мм пулемёт"),
    )

    tank1.armWithBullets(Bullet.RED_BULLET)
    tank1.armWithBullets(Bullet.GREEN_BULLET)
    tank2.armWithBullets(Bullet.BLUE_BULLET)

    tank2.getDamageToFrontalArmor(tank1.shoot(Bullet.RED_BULLET))
    tank2.getDamageToSideArmor(tank1.shoot(Bullet.GREEN_BULLET))
    tank1.getDamageToSideArmor(tank2.shoot(Bullet.BLUE_BULLET))
}

enum class Bullet(val bulletName: String, val impactForce: Int) {
    BLUE_BULLET("синие патроны", 5),
    GREEN_BULLET("зеленые патроны", 10),
    RED_BULLET("красные патроны", 20),
}

class Tank(
    private val name: String,
    private var frontalArmor: Int,
    private var sideArmor: Int,
    private val combatWeight: Int,
    private val maxSpeed: Int,
    private val crew: Int,
    private val armament: List<String>,
) {
    init {
        println("Создан танк $name")
    }

    private var isDestroyed = false
    private val ammunition: MutableList<Bullet> = mutableListOf()

    fun shoot(bullets: Bullet): Int {
        if (bullets !in ammunition) return 0

        return when (bullets) {
            Bullet.RED_BULLET -> Bullet.RED_BULLET.impactForce
            Bullet.GREEN_BULLET -> Bullet.GREEN_BULLET.impactForce
            Bullet.BLUE_BULLET -> Bullet.BLUE_BULLET.impactForce
        }
    }

    fun armWithBullets(bullets: Bullet) {
        val bulletsName = when (bullets) {
            Bullet.RED_BULLET -> Bullet.RED_BULLET.bulletName
            Bullet.GREEN_BULLET -> Bullet.GREEN_BULLET.bulletName
            Bullet.BLUE_BULLET -> Bullet.BLUE_BULLET.bulletName
        }

        if (bullets in ammunition) {
            println("В боекомплект танка $name уже добавлены $bulletsName")
        } else {
            ammunition.add(bullets)
            println("В боекомплект танка $name добавлены $bulletsName")
        }
    }

    fun getDamageToFrontalArmor(damage: Int) {
        if (isDestroyed) {
            println("Нанесение урона невозможно, танк $name уже уничтожен")
            return
        }

        if (damage == 0) {
            println("Нанесение урона танку $name невозможно, у противника нет нужных патронов")
            return
        }

        frontalArmor -= damage
        println("Танк $name получил урон по лобовой броне -$damage")

        if (frontalArmor <= 0) {
            println("Танк $name уничтожен")
            destroyTank()
        }
    }

    fun getDamageToSideArmor(damage: Int) {
        if (isDestroyed) {
            println("Танк $name уничтожен, нанесение удара невозможно")
            return
        }

        if (damage == 0) {
            println("Нанесение урона танку $name невозможно, у противника нет нужных патронов")
            return
        }

        sideArmor -= damage
        println("Танк $name получил урон по боковой броне -$damage")

        if (sideArmor <= 0) {
            println("Танк $name уничтожен")
            destroyTank()
        }
    }

    private fun destroyTank() {
        isDestroyed = true
        frontalArmor = 0
        sideArmor = 0
    }
}