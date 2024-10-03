package org.example.lesson_18

fun main() {
    val fox = Fox("Ириска")
    val dog = Dog("Бруно")
    val cat = Cat("Пряник")

    val animalsList: List<Animal> = listOf(fox, dog, cat)

    animalsList.forEach {
        it.eat()
    }
}

open class Animal(
    val name: String,
) {
    open fun eat() {}

    open fun sleep() {}
}

class Fox(
    name: String,
) : Animal(name) {

    override fun eat() {
        println("Лиса $name ест ягоды")
    }

    override fun sleep() {
        println("Лиса $name спит")
    }
}

class Dog(
    name: String,
) : Animal(name) {

    override fun eat() {
        println("Собака $name ест кости")
    }

    override fun sleep() {
        println("Собака $name спит")
    }
}

class Cat(
    name: String,
) : Animal(name) {

    override fun eat() {
        println("Кошка $name ест рыбу")
    }

    override fun sleep() {
        println("Кошка $name спит")
    }
}