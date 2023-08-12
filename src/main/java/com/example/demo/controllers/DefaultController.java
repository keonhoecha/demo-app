package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.BookService;

import java.util.HashMap;

@RestController
public class DefaultController {
    private final BookService bookService;

    public DefaultController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String getDefault() {
        return "Hello";
    }

    @GetMapping("/{bookId}")
    public String getBookTitle(@PathVariable("bookId") String bookId) {
        return bookService.getBookTitle(bookId);
    }
}
