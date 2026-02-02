package org.example

fun calculateAverage(scores: List<Double>): Double {
    var sum = 0.0
    for (score in scores) {
        sum += score
    }
    return sum / scores.size
}

fun getGrade(average: Double): String {
    return when {
        average >= 90 -> "A"
        average >= 80 -> "B"
        average >= 70 -> "C"
        average >= 60 -> "D"
        else -> "F"
    }
}

fun main() {
    println("Nhập số lượng điểm (ít nhất 3): ")
    val n = readLine()!!.toInt()

    if (n < 3) {
        println("Phải nhập ít nhất 3 điểm!")
        return
    }

    val scores = mutableListOf<Double>()

    for (i in 1..n) {
        print("Nhập điểm thứ $i: ")
        val score = readln().toDouble()
        scores.add(score)
    }

    val average = calculateAverage(scores)
    val grade = getGrade(average)

    println("Điểm trung bình: $average")
    println("Xếp loại: $grade")
}
