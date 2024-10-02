package org.zero.web3.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;
    private final Double epsilon = 0.00001;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void calculatorTest_1() {
        var expected = 0.77816;
        var actual = calculator.apply(5.0);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    public void calculatorTest_2() {
        var expected = 0.951005;
        var actual = calculator.apply(1.200000001);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    public void calculatorTest_3() {
        var expected = 0.34242;
        var actual = calculator.apply(1.20000001);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    public void calculatorTest_4() {
        var actual = calculator.apply(-8.0);

        Assertions.assertTrue(Double.isNaN(actual));
    }
}