package org.zero.web3.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecondFunctionTest {
    private SecondFunction secondFunction;
    private final Double epsilon = 0.00001;

    @BeforeEach
    public void init() {
        secondFunction = new SecondFunction();
    }

    @Test
    public void secondFunctionTest_1() {
       var expected = 0.366196;
       var actual = secondFunction.apply(5.0);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    public void secondFunctionTest_2() {
        var expected = 0.010021;
        var actual = secondFunction.apply(12.0);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    public void secondFunctionTest_3() {
        var actual = secondFunction.apply(-8.0);

        Assertions.assertTrue(Double.isNaN(actual));
    }
}