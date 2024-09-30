package org.zero.web3.service;

import org.zero.web3.model.Result;
import org.zero.web3.utils.Calculator;

import java.util.List;
import java.util.stream.IntStream;

public class TabulationService {
    private final Calculator calculator = new Calculator();
    private final Double start;
    private final Double end;
    private final Double step;

    public TabulationService(Double start, Double end, Double step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }


    public List<Result> tabulate() {
        return IntStream.range(0, getIterations()+1)
                .mapToDouble(iteration -> start + step * iteration)
                .mapToObj(element -> new Result(element, calculator.apply(element)))
                .toList();
    }

    private Integer getIterations() {
        return (int) Math.round((this.end - this.start) / this.step);
    }
}
