package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book addBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public List<Book> getBooksByCategory(String category) {
        return repository.findByCategory(category);
    }

    public void deleteBook(int id) {
        repository.deleteById(id);
    }
}
