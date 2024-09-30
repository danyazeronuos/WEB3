package org.zero.web3.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.zero.web3.model.Result;
import java.util.List;


class TabulationServiceTest {
    private final Double epsilon = 0.00001;
    private final TabulationService tabulationService = new TabulationService(0.5, 2.0, 0.005);
    private final List<Result> actual = tabulationService.tabulate();

    @Test
    public void tabulationServiceTest_1() {
        var expected = 0.00196243;
        Assertions.assertEquals(expected, actual.get(0).getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_2() {
        var expected = 0.951005;
        Assertions.assertEquals(expected, actual.get(140).getY(), epsilon);
    }
    @Test
    public void tabulationServiceTest_3() {
        var expected = 1.09861;
        Assertions.assertEquals(expected, actual.get(300).getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_ResultWithMaxYValue() {
        var expected = 1.09861;
        Assertions.assertEquals(expected, TabulationService.getMax(actual).getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_ResultWithMinYValue() {
        var expected = 0.00196242877;
        Assertions.assertEquals(expected, TabulationService.getMin(actual).getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_Sum() {
        var service = new TabulationService(0.0, 2.0, 0.5);
        var tabulated = service.tabulate();
        var currentActual = TabulationService.getSum(tabulated);
        var expected = 2.97468843;

        Assertions.assertEquals(expected, currentActual, epsilon);
    }

    @Test
    public void tabulationServiceTest_Avg() {
        var service = new TabulationService(0.0, 2.0, 0.5);
        var tabulated = service.tabulate();
        var currentActual = TabulationService.getAvg(tabulated);
        var expected = 0.594937686;

        Assertions.assertEquals(expected, currentActual, epsilon);
    }
}