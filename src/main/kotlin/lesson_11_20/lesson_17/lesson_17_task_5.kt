package org.example.lesson_11_20.lesson_17

fun main() {
    val user = User("Itra", "fwj_798_SWF")
    user.run {
        println(login)
        login = "Ra"
        println(login)

        println(password)
        password = "adf_124"
    }
}

class User(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно обновлен")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")
}