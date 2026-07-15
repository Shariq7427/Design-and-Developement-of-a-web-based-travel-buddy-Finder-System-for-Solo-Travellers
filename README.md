# 🌍 Travel Buddy Finder System for Solo Travellers

A full-stack web application designed to help solo travellers connect with compatible travel partners while providing administrators with tools to manage trips, drivers, vehicles, volunteers, and tour guides.

The system streamlines the travel planning process by allowing users to register, create or join trips, submit travel requests, and communicate through a centralized platform.

---

# 📖 Table of Contents

- Overview
- Features
- System Architecture
- Technology Stack
- Database Design
- REST API Endpoints
- Project Structure
- Installation Guide
- Running the Application
- Future Improvements
- Contributors

---

# 📌 Overview

Travel Buddy Finder System addresses one of the biggest challenges faced by solo travellers—finding trustworthy travel companions.

The application provides:

- Secure user registration and authentication
- Trip creation and management
- Request and application handling
- Administrative dashboard
- Vehicle and guide management
- Volunteer coordination

The backend is developed using **Spring Boot** while the frontend is built with **React.js**, communicating through RESTful APIs.

---

# ✨ Features

## 👤 User Module

- User Registration
- User Login
- Username Availability Check
- Create Travel Trips
- Join Existing Trips
- Leave Trips
- View Available Trips
- Send Travel Requests
- Receive Travel Invitations

---

## 👨‍💼 Admin Module

- Secure Admin Login
- Manage Users
- Manage Drivers
- Manage Vehicles
- Manage Tour Guides
- Manage Volunteers
- Monitor Trip Records

---

## 🚗 Trip Management

- Create Trip
- Delete Trip
- Check Existing Trips
- Assign Driver
- Assign Vehicle
- Assign Tour Guide
- Assign Volunteer

---

## 📩 Request Management

- Create Requests
- Check Pending Requests
- Display Notifications
- Accept / Reject Requests

---

## 📄 User Applications

- Submit Applications
- View Applications
- Delete Applications
- Check Existing Applications

---

# 🏗 System Architecture

```
                React Frontend
                       │
                 Axios REST API
                       │
                Spring Boot Backend
                       │
                Spring Data JPA
                       │
                     MySQL
```

---

# 💻 Technology Stack

## Frontend

- React.js
- JavaScript (ES6)
- React Router
- Axios
- Bootstrap
- CSS3

---

## Backend

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven

---

## Database

- MySQL

---

## Development Tools

- Visual Studio Code
- IntelliJ IDEA / Eclipse
- MySQL Workbench
- Git
- GitHub

---

# 🗄 Database

Database Name

```
travelbuddydb
```

### Tables

| Table |
|---------|
| travel_buddy |
| admin_details |
| trip_details |
| driver_details |
| car_details |
| volunteer_application |
| user_application |
| user_request |
| tour_guide_details |

---

# 📡 REST API

## Authentication

| Method | Endpoint |
|---------|-----------|
| POST | `/signup` |
| GET | `/login` |
| GET | `/userCheck` |
| GET | `/adminCheck` |

---

## Trips

| Method | Endpoint |
|---------|-----------|
| POST | `/tripdetails` |
| GET | `/tripdetails` |
| GET | `/tripCheck` |
| DELETE | `/deletetrip` |

---

## User Requests

| Method | Endpoint |
|---------|-----------|
| POST | `/requests` |
| GET | `/requestCheck` |
| GET | `/requestNotification` |
| GET | `/requestOne` |
| DELETE | `/requestResponse` |

---

## User Applications

| Method | Endpoint |
|---------|-----------|
| POST | `/userapplications` |
| GET | `/applications` |
| GET | `/applicationCheck` |
| DELETE | `/deleteapplication` |

---

# 📂 Project Structure

```
TravelBuddy/
│
├── Backend/
│   └── travelbuddy-backend/
│       ├── controller/
│       ├── entity/
│       ├── repository/
│       ├── service/
│       └── resources/
│
├── Frontend/
│   ├── src/
│   ├── Components/
│   ├── App.js
│   └── package.json
│
└── README.md
```

---

# ⚙ Installation

## Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/TravelBuddy.git
```

```
cd TravelBuddy
```

---

## Backend

```
cd Backend/travelbuddy-backend
```

Configure your MySQL credentials in

```
application.properties
```

Run

```bash
./mvnw spring-boot:run
```

Backend runs on

```
http://localhost:1234
```

---

## Frontend

```
cd Frontend
```

Install dependencies

```bash
npm install
```

Run

```bash
npm start
```

Frontend runs on

```
http://localhost:3000
```

---

# 🔐 Authentication

Two authentication modules are available.

### User Authentication

- Signup
- Login
- Username Validation

### Administrator Authentication

- Admin Login
- Admin Dashboard Access

---

# 🔄 Application Workflow

```
User Registration
        │
        ▼
User Login
        │
        ▼
Create / Join Trip
        │
        ▼
Request Processing
        │
        ▼
Trip Assignment
        │
        ▼
Travel Completion
```

---

# 🚀 Recent Improvements

- Refactored Controllers to Constructor Injection
- Refactored Services to Constructor Injection
- Fixed Dependency Injection Issues
- Implemented Username Validation API
- Implemented Trip Validation API
- Improved Login Authentication
- Improved Signup Workflow
- Fixed REST API Mappings
- Improved Spring Boot Project Structure
- Added Better Exception Handling
- Fixed MySQL Integration
- Improved React–Spring Communication

---

# 🔮 Future Enhancements

- JWT Authentication
- Spring Security
- Email Verification
- Password Encryption (BCrypt)
- Google Maps Integration
- Real-Time Chat
- Push Notifications
- Trip Recommendation Engine
- Payment Integration
- Docker Deployment
- CI/CD Pipeline
- Cloud Deployment (AWS / Azure)

---

# 👨‍💻 Contributors

**Mohammad Shariq Ali**

University of Europe for Applied Sciences

---

# 📜 License

This project is developed for educational and research purposes.