package org.example.lesson_22

fun main() {
    val book = Book("Занимательная электротехника", "Фудзита Горо")
    val bookInfo = BookInfo("Занимательная фармакология", "Сиодзаки Синобу")
    
    println(book.toString())
    // объект обычного класса выводит строку с именем пакета, класса и хэш-код
    println(bookInfo.toString())
    // объект data класс выводит имя класса, его свойства и значения
}

class Book(
    val bookName: String,
    val author: String,
)

data class BookInfo(
    val bookName: String,
    val author: String,
)