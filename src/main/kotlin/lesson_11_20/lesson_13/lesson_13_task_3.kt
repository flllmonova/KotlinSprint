package org.example.lesson_11_20.lesson_13

fun main() {

    val contact1 = ContactDetails("Михаил", 79174902148, "Audi Motors")
    val contact2 = ContactDetails("Андрей", 79174902149, "Skoda Motors")
    val contact3 = ContactDetails("Анатолий", 79174902142, "null")
    val contact4 = ContactDetails("Сергей", 79272316925)
    val contact5 = ContactDetails("Кирилл", 79174471912)

    val contactsList = listOf(contact1, contact2, contact3, contact4, contact5)
    val companiesList = contactsList.mapNotNull {
        it.companyName
    }

    println(companiesList)
}

class ContactDetails(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {
    fun printData() {
        println(
            "- Имя: $name\n" +
            "- Номер: $phoneNumber\n" +
            "- Компания: ${companyName ?: "<не указано>"}"
        )
    }
}