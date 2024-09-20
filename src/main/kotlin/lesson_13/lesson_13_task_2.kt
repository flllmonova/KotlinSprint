package org.example.lesson_13

fun main() {
    val contact1 = DataOfContact("Ярослав", 79174576050).printData()
}

class DataOfContact(
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