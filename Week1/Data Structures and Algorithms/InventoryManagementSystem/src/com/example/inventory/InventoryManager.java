package com.example.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private final Map<String,Product> inventory = new HashMap<>();

    public boolean addProduct(Product p) {
        if (inventory.containsKey(p.getProductId())) return false;
        inventory.put(p.getProductId(), p);
        return true;
    }

    public boolean updateProduct(Product p) {
        if (!inventory.containsKey(p.getProductId())) return false;
        inventory.put(p.getProductId(), p);
        return true;
    }

    public Product deleteProduct(String productId) {
        return inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}
