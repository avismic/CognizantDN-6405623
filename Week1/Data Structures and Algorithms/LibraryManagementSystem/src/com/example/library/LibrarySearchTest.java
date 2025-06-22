package com.example.library;

import java.util.Arrays;

public class LibrarySearchTest {
    public static void main(String[] args) {
        Book[] catalog = {
            new Book("B001", "The Hobbit", "J.R.R. Tolkien"),
            new Book("B002", "1984", "George Orwell"),
            new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B004", "Brave New World", "Aldous Huxley")
        };

        String query = "To Kill a Mockingbird";

        int idx1 = SearchAlgorithms.linearSearch(catalog, query);
        System.out.println("Linear search: " +
            (idx1 >= 0 ? catalog[idx1] : "Not found"));

        Book[] sorted = Arrays.copyOf(catalog, catalog.length);
        SearchAlgorithms.sortByTitle(sorted);

        int idx2 = SearchAlgorithms.binarySearch(sorted, query);
        System.out.println("Binary search: " +
            (idx2 >= 0 ? sorted[idx2] : "Not found"));
    }
}
