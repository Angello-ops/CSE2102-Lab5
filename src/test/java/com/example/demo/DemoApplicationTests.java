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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;

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
                .andExpect(content().string("Strong password"));
    }

    @Test
    public void testEmailCheck() throws Exception {
        mockMvc.perform(post("/api/email-check")
                .param("email", "test@example.com")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().isOk())
                .andExpect(content().string("Valid email"));
    }

    @Test
    public void testQuizQuestions() throws Exception {
        mockMvc.perform(get("/api/quiz"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.size()", is(4))) // Expecting 4 questions
                .andExpect(jsonPath("$.['The SOLID principles are from the functional programming paradigm.']", is("False")))
                .andExpect(jsonPath("$.['The attributes of a database system are cross-cutting attributes.']", is("True")))
                .andExpect(jsonPath("$.['The HTTP protocol depends on the REST protocol.']", is("False")))
                .andExpect(jsonPath("$.['Cloud-based architecture allows both horizontal and vertical scaling.']", is("True")));
    }
}
