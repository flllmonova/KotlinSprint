package org.example.lesson_17

fun main() {
    val folder1 = Folder("How to drift - by BMW-M.com", 20, true)
    println(folder1.name)
}

class Folder(
    _name: String,
    private var filesAmount: Int,
    private var isSecret: Boolean,
) {
    val name = _name
        get() {
            return if (isSecret) "Папка: $field \nКоличество файлов – 0"
            else "Папка: $field \nКоличество файлов - $filesAmount"
        }
}