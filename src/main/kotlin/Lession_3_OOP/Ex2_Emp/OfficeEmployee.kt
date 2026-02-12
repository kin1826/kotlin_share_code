package Lession_3_OOP.Ex2_Emp

class OfficeEmployee(
    id: Int,
    fullName: String,
    baseSalary: Double,
    val workingDays: Int
) : Employee(id, fullName, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + workingDays * 200000
    }

    override fun displayInfo() {
        println("=== Office Employee ===")
        super.displayInfo()
        println("Working Days: $workingDays")
    }
}