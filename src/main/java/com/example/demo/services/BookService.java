package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.domains.BookNotFoundException;

import java.util.HashMap;

@Service
public class BookService {
    public String getBookTitle(String bookId) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Design Patterns");
        map.put("2", "Computer Algorithms");

        if (map.containsKey(bookId)) {
            return map.get(bookId);
        }

        throw new BookNotFoundException(bookId);
    }
}
