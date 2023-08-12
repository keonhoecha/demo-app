package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DefaultControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testDefaultGet() {
        this.webTestClient
                .get()
                .uri("/")
                .exchange()
                .expectStatus().is2xxSuccessful();
    }
}