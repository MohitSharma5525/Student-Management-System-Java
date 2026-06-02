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

## Database Configuration

Before running the project, configure your MySQL credentials in:

```plaintext
src/database/DatabaseConnection.java
```

Update the following values with your own database details:

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/student_db";

private static final String USER =
        "root";

private static final String PASSWORD =
        "YOUR_MYSQL_PASSWORD";
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
