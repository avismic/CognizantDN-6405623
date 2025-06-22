package com.example.inventory;

public class Product {
    private final String productId;
    private String name;
    private int quantity;
    private double price;

    public Product(String productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name      = name;
        this.quantity  = quantity;
        this.price     = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public void   setName(String name) { this.name = name; }
    public int    getQuantity() { return quantity; }
    public void   setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice()  { return price; }
    public void   setPrice(double price)    { this.price = price; }

    @Override
    public String toString() {
        return String.format(
            "Product[id=%s, name=%s, qty=%d, price=%.2f]",
            productId, name, quantity, price
        );
    }
}
