package com.example.demo.domains;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String bookId) {
        super("The book with id " + bookId + " does not exist.");
    }
}
