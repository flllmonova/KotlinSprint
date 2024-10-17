package org.example.lesson_22

fun main() {
    val book = Book("Занимательная электротехника", "Фудзита Горо")
    val bookInfo = BookInfo("Занимательная фармакология", "Сиодзаки Синобу")

    println(book.toString())
    // по умолчанию у объекта при вызове метода toString() выводится его имя класса и хеш-код
    println(bookInfo.toString())
    // в data классе функция toString() формируется компилятором из свойств первичного конструктора,
    // => информация об объекте выводится в удобочитаемом формате
}

class Book(
    val bookName: String,
    val author: String,
)

data class BookInfo(
    val bookName: String,
    val author: String,
)