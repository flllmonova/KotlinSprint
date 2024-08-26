package org.example.lesson3

fun main() {
    val recordOfMove = "D2-D4;0"
    val componentsOfMove = recordOfMove.split("-", ";")
    var numberOfComponent = 0

    val startPointOfMove = componentsOfMove[numberOfComponent++]
    val finalPointOfMove = componentsOfMove[numberOfComponent++]
    val numberOfMove = componentsOfMove[numberOfComponent]

    println("""
        $startPointOfMove
        $finalPointOfMove
        $numberOfMove
    """.trimIndent())
}