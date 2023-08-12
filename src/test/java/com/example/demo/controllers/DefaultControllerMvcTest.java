package com.example.demo.controllers;

import com.example.demo.domains.BookNotFoundException;
import com.example.demo.services.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(DefaultController.class)
public class DefaultControllerMvcTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    void whenGetBookNotExistingThenShouldReturn404() throws Exception {
        String bookId = "999";
        given(bookService.getBookTitle(bookId))
                .willThrow(BookNotFoundException.class);
        mockMvc
                .perform(get("/" + bookId))
                .andExpect(status().isNotFound());
    }
}
