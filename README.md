# Lab 5: REST API Service Overview

## Project Overview
This project is a REST API service built with Spring Boot as part of CSE-2102 Lab 5. The application provides endpoints for password quality checks, email validity checks, and quiz question retrieval. The repository is set up to be easy to run and evaluate by the grader or instructor.

## Quick Start Guide
To get the system up and running, follow these three simple steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Angello-ops/CSE-2102-Lab5
   cd CSE-2102-Lab5

Run the Application:

    Method 1: Use Maven Wrapper in your local operating system's terminal (outside of Codespace): ./mvnw spring-boot:run

Method 2: Run the compiled .jar file directly (ensure you have Java installed): java -jar target/demo-0.0.1-SNAPSHOT.jar

Access the Application:

    Open a web browser and navigate to http://localhost:8080 to view the main page or test the endpoints.
    Use curl, Postman, or any API client to test the specific endpoints such as /api/password-quality, /api/email-check, and /api/quiz.
