package Lession_3_OOP.Ex1_Student_MN

class Student(
    val id: Int,
    val fullName: String,
    val gpa: Double
) {

    fun getClassification(): String {
        return when {
            gpa >= 3.6 -> "Excellent"
            gpa >= 3.2 -> "Good"
            gpa >= 2.5 -> "Average"
            else -> "Poor"
        }
    }

    fun displayInfo() {
        println("Student ID: $id")
        println("Full Name: $fullName")
        println("GPA: $gpa")
        println("Classification: ${getClassification()}")
    }
}

fun main() {
    val student = Student(1, "Nguyen Van A", 3.4)
    student.displayInfo()
}
