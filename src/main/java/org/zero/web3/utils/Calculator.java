package org.zero.web3.utils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.zero.web3.model.ICalculator;

@ApplicationScoped
public class Calculator implements ICalculator {
    private final FirstFunction firstFunction = new FirstFunction();
    private final SecondFunction secondFunction = new SecondFunction();

    @Override
    public Double calculate(Double x) {
        if (x > 1.2 + 1e-9) return firstFunction.apply(x);
        return secondFunction.apply(x);
    }
}
