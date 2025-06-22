package com.example.forecast;

public class ForecastCalculator {
    
    public static double futureValue(double principal, double[] growthRates, int index) {
        if (index >= growthRates.length) {
            return principal;
        }
        double updated = principal * (1 + growthRates[index]);
        return futureValue(updated, growthRates, index + 1);
    }
}
