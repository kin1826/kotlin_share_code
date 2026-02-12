package Lession_2_Function

fun sumArray(arr: IntArray): Int {
    var sum = 0
    for (x in arr) sum += x
    return sum
}

fun avgArray(arr: IntArray): Double {
    return sumArray(arr).toDouble() / arr.size
}

fun maxArray(arr: IntArray): Int {
    var max = arr[0]
    for (x in arr) {
        if (x > max) max = x
    }
    return max
}

fun minArray(arr: IntArray): Int {
    var min = arr[0]
    for (x in arr) {
        if (x < min) min = x
    }
    return min
}

fun searchArray(arr: IntArray, value: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == value) return i
    }
    return -1
}

fun main() {
    print("Nhap so phan tu n: ")
    val n = readln().toInt()

    val arr = IntArray(n)

    println("Nhap $n phan tu:")
    for (i in 0 until n) {
        print("arr[$i] = ")
        arr[i] = readln().toInt()
    }

    println("\n--- KET QUA ---")
    println("Tong = ${sumArray(arr)}")
    println("Trung binh = ${avgArray(arr)}")
    println("Max = ${maxArray(arr)}")
    println("Min = ${minArray(arr)}")

    print("\nNhap gia tri can tim: ")
    val x = readln().toInt()

    val index = searchArray(arr, x)
    if (index != -1) {
        println("Tim thay $x tai vi tri index = $index")
    } else {
        println("Khong tim thay $x trong mang")
    }
}
