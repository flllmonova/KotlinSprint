package org.example.lesson_11_20.lesson_17

class QuizElement(
    _question: String,
    _answer: String,
) {
    val question = _question
        get() = field
    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}