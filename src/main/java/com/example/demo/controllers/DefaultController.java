package com.example.demo.controllers;

import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @Value("${demo.greeting:Hello}")
    private String greeting;

    private final BookService bookService;

    public DefaultController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String getDefault() {
        return greeting;
    }

    @GetMapping("/{bookId}")
    public String getBookTitle(@PathVariable("bookId") String bookId) {
        return bookService.getBookTitle(bookId);
    }
}
