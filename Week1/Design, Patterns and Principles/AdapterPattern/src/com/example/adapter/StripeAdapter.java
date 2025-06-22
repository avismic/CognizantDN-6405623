package com.example.adapter;

public class StripeAdapter implements PaymentProcessor {
    private final StripePayment stripe;

    public StripeAdapter(StripePayment stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        int cents = (int) (amount * 100);
        stripe.stripeCharge(cents);
    }
}
