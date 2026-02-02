package org.example

fun sum(a:Int, b:Int) = a + b

fun diff(a:Int, b:Int) = a - b

fun product(a:Int, b:Int) = a * b

fun quotient(a:Int, b:Int) = a / b

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println(sum(num1, num2))
    println(diff(num1, num2))
    println(product(num1, num2))
    println(quotient(num1, num2))
}