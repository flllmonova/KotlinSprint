package org.example.lesson_13

fun main() {

    val phoneBook: MutableList<ContactInformation> = mutableListOf()

    while (true) {
        println("Заполните контактные данные \nВведите имя:")
        val name = readln()

        println("Напишите номер телефона:")
        val phoneNumber: Long? = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Номер телефона не был введен. Запись контакта начнется сначала\n")
            continue
        }

        println("Введите название компании:")
        val companyName: String? = readln().let {
            if (it == "") null else it
        }

        phoneBook.add(ContactInformation(name, phoneNumber, companyName))
        println("Контакт сохранен. \nЖелаете записать еще один контакт? [ Да / Нет ]")
        if (readln().equals("нет", ignoreCase = true)) break
    }

    println("Ваша телефонная книга:")
    var contactCounter = 1
    phoneBook.forEach { contact: ContactInformation ->
        println("Контакт №${contactCounter++}")
        contact.printData()
    }
}

class ContactInformation(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printData() {
        println(
            "- Имя: $name\n" +
            "- Номер: $phoneNumber\n" +
            "- Компания: ${companyName ?: "<не указано>"}\n"
        )
    }
}