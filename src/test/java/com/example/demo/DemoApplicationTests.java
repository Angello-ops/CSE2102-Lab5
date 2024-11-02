package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPasswordQuality() throws Exception {
        mockMvc.perform(post("/api/password-quality")
                .param("password", "P@ssw0rd123")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().string("Strong password")); // Adjust expected response based on your implementation
    }

    @Test
    public void testEmailCheck() throws Exception {
        mockMvc.perform(post("/api/email-check")
                .param("email", "test@example.com")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().string("Valid email")); // Adjust expected response based on your implementation
    }

    @Test
    public void testQuizQuestions() throws Exception {
        mockMvc.perform(get("/api/quiz"))
                .andExpect(status().isOk())
                .andExpect(content().json("[\"What is Java?\",\"Explain the concept of REST.\",\"Define Spring Boot.\",\"What is dependency injection?\"]")); // Adjust response if needed
    }
}
