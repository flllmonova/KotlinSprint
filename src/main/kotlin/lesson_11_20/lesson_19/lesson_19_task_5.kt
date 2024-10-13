package org.example.lesson_11_20.lesson_19

fun main() {
    val cardFile = CardFile()
    cardFile.run {
        greeting()
        getInstructionToFillOutCard()
        fillOutCard()
    }
}

enum class Gender(val abbreviatedFormOfGender: String) {
    WOMAN("Ж"),
    MAN("М");

    fun getFullFormOfGender(): String = when (this) {
        Gender.MAN -> "мужской"
        Gender.WOMAN -> "женский"
    }
}

class Person(
    val name: String,
    val gender: Gender,
)

class CardFile {
    private val cardFile: MutableList<Person> = mutableListOf()

    private val cardsAmountForPrint = 5
    private val minNameLength = 3

    fun greeting() {
        println("Добро пожаловать в приложение \"Картотека\"!")
    }

    fun getInstructionToFillOutCard() {
        println(
            """
            Инструкция по заполнению карточки:
            - не использовать специальные символы в имени;
            - имя следует писать с заглавной буквы, остальные буквы - строчные; 
            - минимальное количество символов в имени: $minNameLength;
            - для указания пола введите соответствующую заглавную кириллическую букву: 
            "${Gender.MAN.abbreviatedFormOfGender}" / "${Gender.WOMAN.abbreviatedFormOfGender}".
        
        """.trimIndent()
        )
    }

    fun fillOutCard() {
        do {

            var name = ""
            println("Введите имя:")
            do {
                name = readln()
                val specialCharsRange = ' '..'/'

                if (name.length >= minNameLength &&
                    name.all { it !in specialCharsRange } &&
                    name[0].isUpperCase() &&
                    name.drop(1).all { it.isLowerCase() }
                ) {
                    break
                } else println("Имя введено неверно, введите снова")
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
                } else println("Пол введен неверно, введите еще раз:")
            } while (true)

            if (cardFile.size % cardsAmountForPrint == 0) {
                println()
                printCardFile()
                println()
            }

            println("Желаете заполнить еще одну карточку? [ да / нет ]")
            if (readln().equals("нет", ignoreCase = true)) {
                println("Приложение \"Картотека\" закрывается")
                break
            }

        } while (true)
    }

    fun printCardFile() {
        println("Идет печать картотеки:")
        cardFile.forEach { card: Person ->
            println("Имя: ${card.name}, пол: ${card.gender.getFullFormOfGender()}")
            Thread.sleep(500)
        }
    }
}