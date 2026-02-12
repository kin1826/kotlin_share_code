package Lession_3_OOP.Ex2_Emp

class SalesEmployee(
    id: Int,
    fullName: String,
    baseSalary: Double,
    val salesAmount: Double
) : Employee(id, fullName, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + salesAmount * 0.05
    }

    override fun displayInfo() {
        println("=== Sales Employee ===")
        super.displayInfo()
        println("Sales Amount: $salesAmount")
    }
}