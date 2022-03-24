package ru.samsung.itacademy.mdev.simplecalctemplate

class Calculator {
    fun add(a: Int, b: Int): Int = a + b

    fun subtract(a: Int, b: Int): Int = a - b

    fun multiply(a: Int, b: Int): Int = a * b

    fun divide(a: Int, b: Int): Int = if (b != 0) {
        a / b
    } else {
        println("Divide by 0")
        0
    }
}
