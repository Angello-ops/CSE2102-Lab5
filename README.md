# Spring Boot Application

This project is a Spring Boot application with REST endpoints for checking password quality, validating email addresses, and providing a True/False quiz.

## Project Structure

The project is structured with modular controllers, each focused on a single responsibility:

1. **ValidationController** - Contains endpoints for password quality and email validation.
2. **QuizController** - Contains endpoints for retrieving quiz questions and checking answers.

This separation follows the **Single Responsibility Principle (SRP)**, ensuring that each controller class is responsible for one area of functionality.

### Code Organization

- **`src/main/java/com/example/demo/ValidationController.java`**: Handles validation of passwords and emails.
- **`src/main/java/com/example/demo/QuizController.java`**: Manages quiz functionality, including question retrieval and answer checking.
- **`src/main/resources/static/index.html`**: Provides the frontend interface for interacting with the application’s API endpoints.

### Design Patterns and Principles Used

- **Single Responsibility Principle (SRP)**: Each controller addresses a specific domain, which enhances code readability and maintainability.
- **RESTful Design**: The application follows RESTful principles, with clearly defined HTTP methods (GET and POST).
- **Data Encapsulation**: Sensitive logic is encapsulated within controllers, preventing direct access to implementation details.
- **Liskov Substitution Principle (LSP)**: The code could be extended with interfaces to allow subclasses to be used interchangeably, adhering to Liskov’s principle of substitutability.

## Getting Started

### Prerequisites

- **Java 17** or later
- **Maven** for dependency management

### Download, Build, and Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Angello-ops/CSE-2102-Lab5.git
   cd CSE-2102-Lab5
2. **run with spring**:
   NOTE: type the following commands before running it to ensure its working
 ```
./mvnw clean
./mvnw install
./mvnw spring-boot:run```
   
 method1
```./mvnw spring-boot:run```

method2
```java -jar 'location/of/jar/file'```
