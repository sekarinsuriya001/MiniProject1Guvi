# Employee Management System (EMS)

The **Employee Management System (EMS)** is a full-stack web application built to streamline and manage employee data within an organization. It offers features such as creating, reading, updating, and deleting employee records (CRUD operations) via a secure and responsive interface.

---

## 🧰 Tech Stack

### 🔧 Backend
- Java
- Spring Boot
- Spring Data JPA
- Maven
- MySQL

### 🎨 Frontend
- React
- Vite
- JavaScript
- Axios
- Bootstrap
- NPM

### 🧪 Tools
- IntelliJ IDEA (Backend)
- Visual Studio Code (Frontend)
- Postman (API Testing)

---

## 🏗️ Project Structure

### 📦 Backend

```
src/main/java/com/empdata/employeeManagement/
│
├── controller/
│   └── EmpManagementController.java
├── dto/
│   └── EmpManagementDto.java
├── entity/
│   └── EmpManagement.java
├── exception/
│   └── EmpNotFoundException.java
├── mapper/
│   └── EmpManagementMapper.java
├── repository/
│   └── EmpManagementRepository.java
├── service/
│   ├── EmpManagementService.java
│   └── EmpManagementServiceImpl.java
└── EmployeeManagementApplication.java
```

- Configuration: `application.properties`
- Build Tool: `pom.xml`

### 🌐 Frontend

```
src/
├── assets/
├── components/
│   ├── AddEmployee.jsx
│   ├── EmployeeList.jsx
│   ├── Footer.jsx
│   ├── Header.jsx
│   ├── UpdateEmployee.jsx
│   └── ViewEmployee.jsx
├── services/
│   └── EmployeeService.js
├── App.jsx
├── App.css
├── index.css
└── main.jsx

public/
└── index.html
```

- Configuration: `.gitignore`, `eslint.config.js`, `vite.config.js`
- Package: `package.json`, `package-lock.json`

---

## 🔐 Database

**MySQL Table: `employees`**

| Column     | Type   | Description                  |
|------------|--------|------------------------------|
| id         | long   | Employee unique identifier   |
| first_Name | String | First name of the employee   |
| last_Name  | String | Last name of the employee    |
| email      | String | Employee’s email address     |

---

## 📡 API Endpoints

| Method | Endpoint          | Description                        |
|--------|-------------------|------------------------------------|
| POST   | `/employees`      | Create a new employee              |
| GET    | `/employees`      | Retrieve all employees             |
| GET    | `/employees/{id}` | Retrieve an employee by ID         |
| PUT    | `/employees/{id}` | Update an employee by ID           |
| DELETE | `/employees/{id}` | Delete an employee by ID           |

---

## 🚀 How to Run

### 🛠️ Backend (Spring Boot)

1. Open the project in **IntelliJ IDEA**
2. Run `EmployeeManagementApplication.java`
3. Backend will start on: `http://localhost:8080`

### 🌐 Frontend (React)

1. Open the project in **Visual Studio Code**
2. Run:
   ```bash
   npm install
   npm run dev
   ```
3. Frontend will start on: `http://localhost:3000`

---

## 📸 Screenshots

- Home Page  
- Add Employee  
- View Employee  
- Edit Employee  
- Delete Employee  

> All actions are fully functional, and data is persistently stored in the MySQL database.

---

## ✅ Features

- 🔄 CRUD operations for employee records
- ⚙️ RESTful API with Spring Boot
- 🎨 Responsive and dynamic React UI
- 🔒 Role-based access control (extendable)
- 🧩 Scalable, modular project structure
- 🗃️ MySQL database integration

---

## 📌 Conclusion

The **Employee Management System** is a production-ready application tailored for modern HR needs. Built with a modular and scalable approach, EMS ensures ease of maintenance, extension, and deployment.

> This project is an excellent foundation for expanding into more complex systems, such as performance tracking, leave management, or attendance systems.
