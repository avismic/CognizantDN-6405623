package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Book> getAll() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id) {
        return repository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return repository.save(book);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Long id,
                                       @RequestBody Book book) {
        return repository.findById(id)
            .map(existing -> {
                existing.setTitle(book.getTitle());
                existing.setAuthor(book.getAuthor());
                return ResponseEntity.ok(repository.save(existing));
            })
            .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
            .map(existing -> {
                repository.deleteById(id);
                return ResponseEntity.noContent().<Void>build();
            })
            .orElse(ResponseEntity.notFound().build());
    }
}
