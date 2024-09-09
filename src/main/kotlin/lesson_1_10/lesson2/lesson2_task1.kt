package org.example.lesson_1_10.lesson2

fun main() {
    val englishGradeOfStudent1 = 3
    val englishGradeOfStudent2 = 4
    val englishGradeOfStudent3 = 3
    val englishGradeOfStudent4 = 5

    val numberOfStudents = 4

    val averageScoreInEnglish = (
        englishGradeOfStudent1 + englishGradeOfStudent2 +
        englishGradeOfStudent3 + englishGradeOfStudent4).toFloat() / numberOfStudents

    println(averageScoreInEnglish)
}