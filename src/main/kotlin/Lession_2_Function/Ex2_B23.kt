package org.example

import kotlin.math.sqrt

fun checkPrimeNumber(a:Int): Boolean {
    if (a < 2) return false

    for (i in 2..sqrt(a.toDouble()).toInt()) {
        if (a % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val number = 7

    if (checkPrimeNumber(number)) {
        println("$number is a prime")
    } else println("$number is not a prime")
}