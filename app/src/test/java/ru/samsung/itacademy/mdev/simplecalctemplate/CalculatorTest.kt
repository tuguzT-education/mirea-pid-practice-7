package ru.samsung.itacademy.mdev.simplecalctemplate

import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun add() {
        assertEquals(calculator.add(2, 2), 4)
        assertEquals(calculator.add(-3, 7), 4)
        assertEquals(calculator.add(7, -2), 5)
        assertEquals(calculator.add(-5, -1), -6)
    }

    @Test
    fun subtract() {
        assertEquals(calculator.subtract(4, 2), 2)
        assertEquals(calculator.subtract(2, 2), 0)
        assertEquals(calculator.subtract(2, 4), -2)
        assertEquals(calculator.subtract(-3, 7), -10)
        assertEquals(calculator.subtract(7, -2), 9)
        assertEquals(calculator.subtract(-5, -1), -4)
    }

    @Test
    fun multiply() {
        assertEquals(calculator.multiply(2, 2), 4)
        assertEquals(calculator.multiply(-3, 7), -21)
        assertEquals(calculator.multiply(7, -2), -14)
        assertEquals(calculator.multiply(-5, -1), 5)
        assertEquals(calculator.multiply(-5, 0), 0)
        assertEquals(calculator.multiply(0, -1), 0)
    }

    @Test
    fun divide() {
        assertEquals(calculator.divide(2, 2), 1)
        assertEquals(calculator.divide(-3, 7), 0)
        assertEquals(calculator.divide(7, -2), -3)
        assertEquals(calculator.divide(-5, -1), 5)
        assertEquals(calculator.divide(-5, 0), 0)
        assertEquals(calculator.divide(0, -1), 0)
    }

    @Test
    fun all() {
        assertEquals(calculator.add(2, 2), 4)
        assertEquals(calculator.subtract(4, 2), 2)
        assertEquals(calculator.multiply(2, 2), 4)
        assertEquals(calculator.divide(2, 2), 1)
    }
}
