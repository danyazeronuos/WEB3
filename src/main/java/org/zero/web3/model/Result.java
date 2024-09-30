package org.zero.web3.model;

public class Result {
    private final Double x;

    @Override
    public String toString() {
        return "Result{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private final Double y;

    public Result(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
