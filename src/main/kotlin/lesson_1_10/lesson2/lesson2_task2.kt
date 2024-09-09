package org.example.lesson_1_10.lesson2

fun main() {
    val numberOfEmployees = 50
    val salaryOfEmployee = 30_000
    val paymentOfSalariesToEmployees = numberOfEmployees * salaryOfEmployee

    val numberOfInterns = 30
    val salaryOfInterns = 20_000
    val paymentOfSalariesToInterns = numberOfInterns * salaryOfInterns

    val numberOfEmployeesAndInterns = numberOfEmployees + numberOfInterns
    val paymentOfSalariesToEmployeesAndInterns = paymentOfSalariesToEmployees + paymentOfSalariesToInterns
    val averageSalaryInCompany = paymentOfSalariesToEmployeesAndInterns / numberOfEmployeesAndInterns

    println(paymentOfSalariesToEmployees)
    println(paymentOfSalariesToEmployeesAndInterns)
    println(averageSalaryInCompany)
}