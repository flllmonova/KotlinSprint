package org.example.lesson_22

fun main() {

    val person1 = Person("Даниил", "МС Моторс", 79174476060)

    val (name, companyName, phone) = person1

    println(name)
    println(companyName)
    println(phone)
}

data class Person(
    val name: String,
    val companyName: String,
    val phone: Long,
)