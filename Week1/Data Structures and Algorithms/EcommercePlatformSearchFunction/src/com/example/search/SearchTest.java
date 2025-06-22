package com.example.search;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Scissor", "Tools"),
            new Product("P002", "PS5", "Electronics"),
            new Product("P003", "Smartphone", "Electronics"),
            new Product("P004", "Shirt", "Misc")
        };

        String target = "Scissor";

        int idx1 = SearchAlgorithms.linearSearch(products, target);
        System.out.println("Linear search: " + 
            (idx1 >= 0 ? products[idx1] : "Not found")
        );

        Product[] sorted = Arrays.copyOf(products, products.length);
        SearchAlgorithms.sortByName(sorted);

        int idx2 = SearchAlgorithms.binarySearch(sorted, target);
        System.out.println("Binary search: " + 
            (idx2 >= 0 ? sorted[idx2] : "Not found")
        );
    }
}
