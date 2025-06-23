package com.example.demo;
import jakarta.persistence.*;
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @SequenceGenerator(name = "book_seq", sequenceName = "BOOK_SEQ", allocationSize = 1)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "category")
    private String category;
    public Book() {
        super();
    }
    public Book(String title, String author, String category) {
        super();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + "]";
    }
}

