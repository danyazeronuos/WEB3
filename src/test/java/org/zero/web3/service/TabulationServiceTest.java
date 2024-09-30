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
        var expected = 1.09694423;
        Assertions.assertEquals(expected, actual.getLast().getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_ResultWithMaxYValue() {
        var expected = 1.09694423;
        Assertions.assertEquals(expected, tabulationService.getMax(actual).getY(), epsilon);
    }

    @Test
    public void tabulationServiceTest_ResultWithMinYValue() {
        var expected = 0.00196242877;
        Assertions.assertEquals(expected, tabulationService.getMin(actual).getY(), epsilon);
    }
}