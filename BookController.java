package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/category")
    public List<Book> getByCategory(@RequestParam String category) {
        return service.getBooksByCategory(category);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        service.deleteBook(id);
        return "Book deleted";
    }
}
