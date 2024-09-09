package org.example.lesson3

fun main() {
    val number = 5
    var counter = 1

    println(
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter++}\n" +
        "$number x $counter = ${number * counter}")
}