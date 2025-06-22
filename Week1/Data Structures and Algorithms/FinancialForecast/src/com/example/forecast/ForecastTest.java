package com.example.forecast;

public class ForecastTest {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double[] rates = {0.05, 0.04, 0.03, 0.06};
        double fv = ForecastCalculator.futureValue(initialAmount, rates, 0);
        System.out.printf(
            "Future value after %d periods: %.2f%n",
            rates.length, fv
        );
    }
}
