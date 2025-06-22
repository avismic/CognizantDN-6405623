package com.example.adapter;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalPayment paypal;

    public PayPalAdapter(PayPalPayment paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
