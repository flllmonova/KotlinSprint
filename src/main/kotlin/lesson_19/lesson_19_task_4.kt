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

    tank1.armWithGreenBullets()
    tank1.armWithRedBullets()
    tank2.armWithBlueBullets()

    tank2.getDamageToSideArmor(tank1.shootRedBullets())
    tank2.getDamageToFrontalArmor(tank1.shootGreenBullets())
    tank1.getDamageToSideArmor(tank2.shootBlueBullets())
    tank1.getDamageToFrontalArmor(tank2.shootRedBullets())
}

enum class BULLET(val bulletName: String, val impactForce: Int) {
    BLUE_BULLET("синие патроны",5),
    GREEN_BULLET("зеленые патроны",10),
    RED_BULLET("красные патроны",20),
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
    private val ammunition: MutableList<BULLET> = mutableListOf()

    fun shootBlueBullets(): Int = if (BULLET.BLUE_BULLET in ammunition) BULLET.BLUE_BULLET.impactForce else 0

    fun shootGreenBullets() = if (BULLET.GREEN_BULLET in ammunition) BULLET.GREEN_BULLET.impactForce else 0

    fun shootRedBullets() = if (BULLET.RED_BULLET in ammunition) BULLET.RED_BULLET.impactForce else 0

    fun armWithBlueBullets() {
        if (BULLET.BLUE_BULLET in ammunition) {
            println("В боекомплект танка $name уже добавлены ${BULLET.BLUE_BULLET.bulletName}")
            return
        }

        ammunition.add(BULLET.BLUE_BULLET)
        println("В боекомплект танка $name добавлены ${BULLET.BLUE_BULLET.bulletName}")
    }

    fun armWithGreenBullets() {
        if (BULLET.GREEN_BULLET in ammunition) {
            println("В боекомплект танка $name уже добавлены ${BULLET.GREEN_BULLET.bulletName}")
            return
        }

        ammunition.add(BULLET.GREEN_BULLET)
        println("В боекомплект танка $name добавлены ${BULLET.GREEN_BULLET.bulletName}")
    }

    fun armWithRedBullets() {
        if (BULLET.RED_BULLET in ammunition) {
            println("В боекомплект танка $name уже добавлены ${BULLET.RED_BULLET.bulletName}")
            return
        }

        ammunition.add(BULLET.RED_BULLET)
        println("В боекомплект танка $name добавлены ${BULLET.RED_BULLET.bulletName}")
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