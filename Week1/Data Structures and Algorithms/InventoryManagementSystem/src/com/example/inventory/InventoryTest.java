package com.example.inventory;

public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("P001", "Apple", 100, 9.99));
        manager.addProduct(new Product("P002", "Ice", 50, 19.99));

        Product p = manager.getProduct("P001");
        if (p != null) {
            p.setQuantity(120);
            manager.updateProduct(p);
        }

        System.out.println(manager.getProduct("P001"));

        manager.deleteProduct("P002");
        System.out.println(manager.getProduct("P002"));
    }
}
