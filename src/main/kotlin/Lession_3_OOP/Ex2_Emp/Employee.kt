package Lession_3_OOP.Ex2_Emp

open class Employee(
    val id: Int,
    val fullName: String,
    val baseSalary: Double
) {
    open fun calculateSalary(): Double {
        return baseSalary
    }

    open fun displayInfo() {
        println("ID: $id")
        println("Full Name: $fullName")
        println("Base Salary: $baseSalary")
        println("Total Salary: ${calculateSalary()}")
    }
}