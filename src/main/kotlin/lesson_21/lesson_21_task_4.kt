package org.example.lesson_21

import java.io.File

fun File.appendTextToBeginning(text: String) {
    val textStore = this.readLines()

    this.writeText(text.lowercase())

    for (line in textStore) {
        this.appendText("\n$line")
    }
}