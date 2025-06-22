package com.example.library;

public class Book {
    private final String bookId;
    private final String title;
    private final String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title  = title;
        this.author = author;
    }

    public String getBookId() { return bookId; }
    public String getTitle()  { return title;  }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return String.format(
            "Book[id=%s, title=\"%s\", author=\"%s\"]",
            bookId, title, author
        );
    }
}
