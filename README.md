# Student Management System

A Java console-based Student Management System built using:

- Java
- OOP
- JDBC
- MySQL
- DAO Pattern
- SQL CRUD Operations

## Features

✔ Add Student

✔ View Students

✔ Search Student

✔ Update Student

✔ Delete Student

✔ Sort By Marks

✔ Sort By Name

✔ Input Validation

✔ Database Integration

## Technologies Used

- Java
- MySQL
- JDBC
- VS Code

## Project Structure

StudentManagement

├── src
│   ├── database
│   ├── dao
│   ├── model
│   ├── service
│   └── Main.java
├── lib
└── README.md

## Database

Database Name:

```sql
student_db
```

Table:

```sql
CREATE TABLE students(

id INT PRIMARY KEY,

name VARCHAR(100),

marks DOUBLE

);
```

## How To Run

Compile:

```powershell
javac src/Main.java src/model/Student.java src/service/StudentService.java src/database/DatabaseConnection.java src/dao/StudentDAO.java
```

Run:

```powershell
java -cp "src;lib/*" Main
```
