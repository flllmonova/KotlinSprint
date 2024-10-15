package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String = (this.maxBy { it.value }).key