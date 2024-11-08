package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {

    @PostMapping("/api/password-quality")
    public String checkPasswordQuality(@RequestParam("password") String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") &&
            password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return "Strong password";
        } else {
            return "Weak password";
        }
    }

    @PostMapping("/api/email-check")
    public String checkEmailValidity(@RequestParam("email") String email) {
        if (email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            return "Valid email";
        } else {
            return "Invalid email";
        }
    }
}
