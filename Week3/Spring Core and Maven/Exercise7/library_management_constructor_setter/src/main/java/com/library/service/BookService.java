package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println(">> Constructor injection: BookRepository set");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println(">> Setter injection: BookRepository set");
    }

    public void printBook(String id) {
        System.out.println(bookRepository.findBookById(id));
    }
}
