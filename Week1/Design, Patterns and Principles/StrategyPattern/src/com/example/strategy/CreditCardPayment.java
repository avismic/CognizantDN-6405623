package com.example.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolder;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Charging $" + amount + " to card:");
        System.out.println("  Number:      " + cardNumber);
        System.out.println("  Cardholder:  " + cardHolder);
        System.out.println("  CVV:         " + cvv);
        System.out.println("  Expiry Date: " + expiryDate);
        System.out.println("Payment successful!\n");
    }
}
