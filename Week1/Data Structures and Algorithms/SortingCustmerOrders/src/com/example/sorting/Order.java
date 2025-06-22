package com.example.sorting;

public class Order {
    private final String orderId;
    private final String customerName;
    private final double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId      = orderId;
        this.customerName = customerName;
        this.totalPrice   = totalPrice;
    }

    public String getOrderId()   { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return String.format(
            "Order[id=%s, customer=%s, total=%.2f]",
            orderId, customerName, totalPrice
        );
    }
}
