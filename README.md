# Library Management System

![Maven Build](https://img.shields.io/badge/Build-Maven-brightgreen)

## Description
A full-stack Java and SQL project designed to manage library operations, including book inventory, user management, and transaction records. Built using object-oriented principles and relational database management.

## Technologies Used
- Java
- MySQL
- JDBC
- Object-Oriented Programming (OOP)

## Features
- Add, update, delete, and search for books
- Register new users
- Borrow and return book functionality
- Track transactions and history
- SQL database integration with Java application

## How to Run
1. Clone the repository:
   ```
   git clone https://github.com/itzsani/library-management-system.git
   ```
2. Navigate into the project folder:
   ```
   cd library-management-system
   ```
3. Set up a MySQL database using the provided `library_schema.sql`.
4. Configure your DB credentials in `DBConnection.java`.
5. Compile and run using Maven:
   ```
   mvn compile
   mvn exec:java
   ```

## Future Improvements
- Implement user authentication and role management (Admin vs. User)
- Enhance UI with a graphical interface (JavaFX)
- Add overdue book tracking and fine calculation

## Author
Syed Hussain-Sani
