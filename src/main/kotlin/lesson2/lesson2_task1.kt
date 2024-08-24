package org.example.lesson2

fun main() {
    val englishGradeofStudent1 = (3).toFloat()
    val englishGradeofStudent2 = (4).toFloat()
    val englishGradeofStudent3 = (3).toFloat()
    val englishGradeofStudent4 = (5).toFloat()

    val numberOfStudents = 4

    val averageScoreInEnglish = (
        englishGradeofStudent1 + englishGradeofStudent2 +
        englishGradeofStudent3 + englishGradeofStudent4) / numberOfStudents

    println(averageScoreInEnglish)
}