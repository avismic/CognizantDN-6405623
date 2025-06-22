package com.example.adapter;

public class StripePayment {
    public void stripeCharge(int cents) {
        System.out.println("Charged " + cents + " cents via Stripe");
    }
}
