package org.zero.web3.model;

public record ResultModel(
        Double sum,
        Result max,
        Result min,
        Double avg,
        Data data
) {
}
