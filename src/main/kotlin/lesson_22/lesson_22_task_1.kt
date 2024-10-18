package org.example.lesson_22

fun main() {

    val book1 = RegularBook("Занимательная фармакология", "Сиодзаки Синобу")
    val book2 = RegularBook("Занимательная фармакология", "Сиодзаки Синобу")

    val dataBook1 = DataBook("Занимательная электротехника", "Фудзита Горо")
    val dataBook2 = DataBook("Занимательная электротехника", "Фудзита Горо")

    println(book1.equals(book2))
    // в объектах обычного класса сравниваются ссылки, ссылки объектов разные => false
    println(dataBook1.equals(dataBook2))
    // в объектах data класса сравниваются значения свойств, в примере содержимое объектов одинаковое => true
}

class RegularBook(
    val bookName: String,
    val author: String,
) {
    override fun equals(other: Any?): Boolean = this === other
}


data class DataBook(
    val bookName: String,
    val author: String,
)