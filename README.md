# Movie Rental System (REST API)

Java + Spring Boot backend application for managing a simple movie rental business.  
Created as a PJATK university project and maintained as a portfolio project for Java backend roles.

---

## Features

- Manage movies (CRUD)
- Manage customers (CRUD)
- Rent and return movies (rental flow)
- Persistence with relational database (JPA/Hibernate)
- Input validation and consistent error handling (if implemented)

> If your project includes more features (e.g. reservations, late fees, pagination, filtering, authentication), list them here.

---

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Persistence:** Spring Data JPA (Hibernate)
- **Build tool:** Maven
- **Database:** SQL (e.g. MySQL / PostgreSQL)
- **Testing:** JUnit (and Mockito if used)
- **Tools:** Git

---

## Project Structure (high level)

Typical layered architecture:
- **Controller** layer – REST endpoints
- **Service** layer – business logic
- **Repository** layer – database access (Spring Data JPA)
- **DTO/Model** – request/response objects (if used)

---

## Requirements

- Java **17+** (change if you use another version)
- Maven **3.9+**
- Database: **MySQL** or **PostgreSQL** (depending on your configuration)

---

## Configuration

Create / update `application.properties` (or `application.yml`) with your database credentials.

Example (adjust values):
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movie_rental
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> If you already have a config file committed, mention the path here and remove this section.

---

## Running the App (Local)

1. Start your database (and create an empty schema if required).
2. Build the project:
```bash
mvn clean package
```
3. Run the application:
```bash
mvn spring-boot:run
```

By default the app will be available at:
- `http://localhost:8080` (change if you configured a different port)

---

## API Documentation (Swagger / OpenAPI)

If Swagger/OpenAPI is enabled, check (adjust if needed):
- `http://localhost:8080/swagger-ui/index.html`
- `http://localhost:8080/v3/api-docs`

If you don’t have Swagger yet, you can:
- add `springdoc-openapi-starter-webmvc-ui` dependency,
- then include the links above in this section.

---

## Example Endpoints

> Update paths to match your actual controllers.

- `GET /api/movies` – list movies  
- `GET /api/movies/{id}` – get movie details  
- `POST /api/movies` – create movie  
- `PUT /api/movies/{id}` – update movie  
- `DELETE /api/movies/{id}` – delete movie  

- `POST /api/rentals` – rent a movie  
- `POST /api/rentals/{id}/return` – return a movie  

---

## Tests

Run tests:
```bash
mvn test
```

---

## Author

- GitHub: https://github.com/Mortiz2
