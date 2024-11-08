package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class QuizController {

    private static final Map<String, String> quizQuestions = new HashMap<>();

    static {
        quizQuestions.put("The SOLID principles are from the functional programming paradigm.", "False");
        quizQuestions.put("The attributes of a database system are cross-cutting attributes.", "True");
        quizQuestions.put("The HTTP protocol depends on the REST protocol.", "False");
        quizQuestions.put("Cloud-based architecture allows both horizontal and vertical scaling.", "True");
    }

    @GetMapping("/api/quiz")
    public Map<String, String> getQuizQuestions() {
        return quizQuestions;
    }

    @PostMapping("/api/check-answer")
    public String checkAnswer(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        String correctAnswer = quizQuestions.get(question);
        if (correctAnswer != null && correctAnswer.equalsIgnoreCase(answer.trim())) {
            return "Correct!";
        } else {
            return "Incorrect. The correct answer is: " + correctAnswer;
        }
    }
}
