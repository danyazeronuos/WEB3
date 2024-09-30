package org.zero.web3.utils;

import java.util.function.Function;

public class FirstFunction implements Function<Double, Double> {
    @Override
    public Double apply(Double x) {
        return Math.log(x + 1);
    }
}
