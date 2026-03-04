# 🏥 HealPoint - Hospital Management System

A comprehensive hospital management system built with Spring Boot that facilitates seamless management of appointments, specialists, inventory, billing, and patient care.

## 📋 Overview

HealPoint is a modern, RESTful backend application designed to streamline hospital operations. It provides secure authentication, role-based access control, and comprehensive APIs for managing healthcare services including appointment scheduling, inventory management, billing, and specialist coordination.

## ✨ Features

- **User Management**
  - Secure user authentication and authorization using JWT
  - Role-based access control (RBAC)
  - User registration and profile management

- **Appointment System**
  - Schedule, manage, and track patient appointments
  - Slot-based booking system
  - Appointment status tracking (Pending, Confirmed, Cancelled, Completed)

- **Specialist Management**
  - Manage healthcare specialists and their availability
  - Associate specialists with specific slots and departments

- **Inventory Management**
  - Track medical supplies and equipment
  - Category-based inventory organization
  - Real-time stock monitoring

- **Billing & Cart**
  - Generate and manage patient bills
  - Shopping cart functionality for medical items
  - Order history tracking

- **Security**
  - JWT-based authentication
  - Password encryption
  - Secure API endpoints

## 🛠️ Technology Stack

- **Backend Framework**: Spring Boot 3.5.0
- **Language**: Java 17
- **Database**: PostgreSQL
- **ORM**: Spring Data JPA & Hibernate
- **Security**: Spring Security with JWT (JSON Web Tokens)
- **Object Mapping**: MapStruct 1.5.5
- **Utilities**: Lombok, Apache Commons
- **Build Tool**: Maven
- **Validation**: Jakarta Validation API

## 📦 Prerequisites

Before running this application, ensure you have the following installed:

- **Java Development Kit (JDK) 17** or higher
- **Maven 3.6+** (or use included Maven wrapper)
- **PostgreSQL 12+**
- **Git** (for cloning the repository)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Krishal-Modi/HealPoint.git
cd HealPoint/HealPoint
```

### 2. Database Setup

Create a PostgreSQL database:

```sql
CREATE DATABASE HealPoint;
```

### 3. Configure Application Properties

Update the database credentials in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/HealPoint
spring.datasource.username=your_postgres_username
spring.datasource.password=your_postgres_password
```

### 4. Build the Project

Using Maven wrapper (recommended):

```bash
# Windows
mvnw.cmd clean install

# Linux/Mac
./mvnw clean install
```

Or using Maven:

```bash
mvn clean install
```

### 5. Run the Application

```bash
# Windows
mvnw.cmd spring-boot:run

# Linux/Mac
./mvnw spring-boot:run
```

The application will start on **http://localhost:8086**

## 🔧 Configuration

Key configuration options in `application.properties`:

```properties
# Server Port
server.port=8086

# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/HealPoint
spring.datasource.username=postgres
spring.datasource.password=root

# JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 📡 API Endpoints

### Authentication & User Management

- `POST /users/signup` - Register a new user
- `GET /users/getAllUsers` - Get all users (requires authentication)
- `DELETE /users/deleteAccount` - Delete user account

### Appointments

- Manage patient appointments
- Schedule and track appointment status

### Specialists

- CRUD operations for healthcare specialists
- Manage specialist availability and schedules

### Slots

- Manage appointment time slots
- Check slot availability

### Inventory

- Track medical inventory
- Category-based item management

### Billing

- Generate bills for patients
- Track billing items and order history

### Cart

- Add items to cart
- Process orders

### Roles

- Manage user roles and permissions

## 📁 Project Structure

```
HealPoint/
├── src/
│   ├── main/
│   │   ├── java/com/example/HealPoint/
│   │   │   ├── config/           # Security and app configuration
│   │   │   ├── controller/       # REST API controllers
│   │   │   ├── entity/           # JPA entities
│   │   │   ├── enums/            # Enumeration types
│   │   │   ├── exceptions/       # Custom exceptions
│   │   │   ├── filter/           # JWT authentication filter
│   │   │   ├── mapper/           # MapStruct mappers
│   │   │   ├── model/            # DTOs and models
│   │   │   ├── repository/       # Data repositories
│   │   │   ├── service/          # Business logic
│   │   │   └── utils/            # Utility classes
│   │   └── resources/
│   │       └── application.properties
│   └── test/                     # Unit and integration tests
└── pom.xml                       # Maven configuration
```

## 🧪 Testing

Run tests using:

```bash
mvn test
```

## 🔒 Security

The application uses:
- JWT tokens for stateless authentication
- Spring Security for endpoint protection
- Password encryption using BCrypt
- Role-based authorization

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👨‍💻 Author

**Krishal Modi**
- GitHub: [@Krishal-Modi](https://github.com/Krishal-Modi)

## 📧 Contact

For any queries or support, please open an issue in the GitHub repository.

---

Made with ❤️ for better healthcare management