package com.sebix.cucumbertest

import org.junit.Test
import org.junit.jupiter.api.Assertions


class ClassToTestTest {
    val testClass = ClassToTest()

    @Test
    internal fun test_sum_return10() {
        val result = testClass.sum(2, 8)
        Assertions.assertEquals(10, result)
    }
}