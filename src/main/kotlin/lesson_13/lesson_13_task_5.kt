package org.example.lesson_13

fun main() {
    val number: Long? = readln().toLongOrNull()
    println("NumberFormatException")
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
