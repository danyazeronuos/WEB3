package org.zero.web3.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstFunctionTest {

    private FirstFunction firstFunction;
    private final Double epsilon = 0.00001;

    @BeforeEach
    public void init() {
        firstFunction = new FirstFunction();
    }
    @Test
    void firstFunctionTest_1() {
        var expected = 1.79176;
        var actual = firstFunction.apply(5.0);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    void firstFunctionTest_2() {
        var expected = 2.48491;
        var actual = firstFunction.apply(11.0);

        Assertions.assertEquals(expected, actual, epsilon);
        Assertions.assertFalse(Double.isNaN(actual));
    }

    @Test
    void firstFunctionTest_3() {
        var actual = firstFunction.apply(-8.0);

        Assertions.assertTrue(Double.isNaN(actual));
    }

}