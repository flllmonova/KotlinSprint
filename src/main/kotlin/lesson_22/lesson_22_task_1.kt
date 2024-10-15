package org.example.lesson_22

fun main() {

    val book1 = RegularBook("Занимательная фармакология", "Сиодзаки Синобу")
    val book2 = RegularBook("Занимательная фармакология", "Сиодзаки Синобу")

    val dataBook1 = DataBook("Занимательная электротехника", "Фудзита Горо")
    val dataBook2 = DataBook("Занимательная электротехника", "Фудзита Горо")

    println(book1 == book2)
    // в объектах обычного класса сравниваются ссылки, ссылки объектов разные => false
    println(dataBook1 == dataBook2)
    // в объектах data класса сравниваются значения свойств, в примере значения объектов одинаковые => true
}

class RegularBook(
    val bookName: String,
    val author: String,
)

data class DataBook(
    val bookName: String,
    val author: String,
)