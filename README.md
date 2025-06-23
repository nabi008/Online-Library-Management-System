# 📚 Online Library Management System

A Spring Boot-based backend project for managing an online library, featuring RESTful APIs for book management operations such as adding, viewing, filtering by category, and deleting books. This project integrates with an Oracle SQL database using Spring Data JPA and is tested using Postman.

---

## 🚀 Features

- Add new books (title, author, category)
- Retrieve all books
- Filter books by category
- Delete books by ID
- Integration with Oracle Database using JPA & Hibernate
- Tested with Postman

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring Web, Spring Data JPA
- **Database:** Oracle SQL
- **ORM:** Hibernate
- **Tools:** Maven, Postman
- **Java Version:** 17+

---

## 🗂️ Project Structure

src/
├── main/
│ ├── java/
│ │ └── com.example.library/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── LibraryAppApplication.java
│ └── resources/
│ └── application.properties
