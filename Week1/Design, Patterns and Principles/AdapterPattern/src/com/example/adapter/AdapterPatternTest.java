package com.example.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePayment());
        stripeProcessor.processPayment(29.99);

        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPayment());
        paypalProcessor.processPayment(15.50);
    }
}
