package org.example.lesson_19

fun main() {
    val cardsAmount = 5
    val minNameLength = 3
    val cardFile: MutableList<Person> = mutableListOf()

    println("""
        Добро пожаловать в приложение "Картотека"!
        Инструкция по заполнению карточки:
        - имя следует писать с заглавной буквы, остальные буквы - строчные; 
        - минимальное количество символов в имени: $minNameLength;
        - для указания пола введите соответствующую заглавную кириллическую букву: "М" / "Ж".
        
    """.trimIndent())

    do {
        var name = ""
        println("Введите имя:")
        do {
            name = readln()
            if (name.length >= minNameLength && name[0].isUpperCase() && name.drop(1).all { it.isLowerCase() }) {
                break
            } else {
                println("Имя введено неверно, введите снова")
            }
        } while (true)

        println("Введите пол:")

        do {
            val genderInput = readln()
            val listOfGenderAbbreviatedForm = Gender.entries.map { it.abbreviatedFormOfGender }

            if (genderInput in listOfGenderAbbreviatedForm) {
                val gender = if (genderInput == Gender.MAN.abbreviatedFormOfGender) Gender.MAN else Gender.WOMAN
                println("Карточка создана!")
                cardFile.add(Person(name, gender))
                break
            } else {
                println("Пол введен неверно, введите еще раз:")
            }
        } while(true)

        if (cardFile.size %cardsAmount == 0) {
            println()
            printCardFile(cardFile)
            println()
        }

        println("Желаете заполнить еще одну? [ да / нет ]")
        if(readln().equals("нет", ignoreCase = true)) {
            println("Приложение \"Картотека\" закрывается")
            break
        }

    } while (true)
}

enum class Gender(val abbreviatedFormOfGender: String) {
    WOMAN("Ж"),
    MAN("М");

    fun getFullFormOfGender(): String = when(this) {
        Gender.MAN -> "мужской"
        Gender.WOMAN -> "женский"
    }
}

class Person(
    val name: String,
    val gender: Gender,
)

fun printCardFile(cardFile: List<Person>) {
    println("Идет печать картотеки:")
    cardFile.forEach { card: Person ->
        println("Имя: ${card.name}, пол: ${card.gender.getFullFormOfGender()}")
        Thread.sleep(500)
    }
}