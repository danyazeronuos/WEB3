package org.zero.web3.utils;

import java.util.function.Function;

public class SecondFunction implements Function<Double, Double> {
    private static final Double a = 20.3;
    @Override
    public Double apply(Double x) {
        var sin = Math.sin(Math.sqrt(a * x));
        return sin * sin;
    }
}
