package com.example.search;

public class Product {
    private final String productId;
    private final String productName;
    private final String category;

    public Product(String productId, String productName, String category) {
        this.productId   = productId;
        this.productName = productName;
        this.category    = category;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format(
            "Product[id=%s, name=%s, category=%s]",
            productId, productName, category
        );
    }
}
