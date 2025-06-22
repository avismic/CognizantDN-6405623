package com.example.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(
            new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/25")
        );
        context.pay(100.00);

        context.setStrategy(new PayPalPayment("john@example.com"));
        context.pay(250.75);
    }
}
