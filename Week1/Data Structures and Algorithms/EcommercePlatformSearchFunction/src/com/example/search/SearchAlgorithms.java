package com.example.search;

import java.util.Comparator;

public class SearchAlgorithms {
   
    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName()
                         .equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String targetName) {
        int left  = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].getProductName()
                                   .compareToIgnoreCase(targetName);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void sortByName(Product[] products) {
        java.util.Arrays.sort(products, 
            Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER)
        );
    }
}
