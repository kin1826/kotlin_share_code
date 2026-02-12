package Lession_3_OOP.Ex2_Emp

fun main() {
    // Test OfficeEmployee
    val officeEmp = OfficeEmployee(1, "Nguyen Van A", 5000000.0, 20)
    officeEmp.displayInfo()

    println()

    // Test SalesEmployee
    val salesEmp = SalesEmployee(2, "Tran Thi B", 6000000.0, 100000000.0)
    salesEmp.displayInfo()
}