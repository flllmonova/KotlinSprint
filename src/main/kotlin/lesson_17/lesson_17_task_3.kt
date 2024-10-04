package org.example.lesson_17

fun main() {
    val folder1 = Folder("How to drift - by BMW-M.com", 20, true)
    folder1.run {
        println(name)
        println(filesAmount)
    }
}

class Folder(
    _name: String,
    _filesAmount: Int,
    private var isSecret: Boolean,
) {
    val name = _name
        get() = if (isSecret) "скрытая папка" else field

    val filesAmount = _filesAmount
        get() = if (isSecret) 0 else field
}