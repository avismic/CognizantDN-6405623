package com.example.sorting;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O100", "Alice", 250.00),
            new Order("O101", "Bob",   125.50),
            new Order("O102", "Carol", 305.75),
            new Order("O103", "Dave",  200.00)
        };

        Order[] bubbleSorted = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.bubbleSort(bubbleSorted);
        System.out.println("Bubble-sorted:");
        for (Order o : bubbleSorted) System.out.println("  " + o);

        Order[] quickSorted = Arrays.copyOf(orders, orders.length);
        SortingAlgorithms.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick-sorted:");
        for (Order o : quickSorted) System.out.println("  " + o);
    }
}
