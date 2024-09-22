package org.example.lesson_13

fun main() {
    try {
        println("Введите номер телефона:")
        val phoneNumber: Long = readln().toLong()
    } catch (e: Exception) {
        println(e::class.simpleName)
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