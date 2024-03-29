# Bitcoin Mining Application

## Overview

This project is a Java Spring Boot application for mining Bitcoin and managing related functionalities such as user accounts, transaction history, configuration settings, logging, and audit trails.

  
## Features

* **Bitcoin Mining:**  Mine Bitcoin using the application.  
* **User Accounts:** Register and manage user accounts for accessing the application.  
* **Transaction History:** View transaction history including details of all Bitcoin transactions.  
* **Configuration Settings:** Manage configuration settings for the mining process and application behavior.  
* **Logging and Audit Trails:** Log important events and actions for auditing and troubleshooting purposes.  


  
  
## Project Structure

The project follows a typical Spring Boot application structure:
```bash
bitcoin-mining-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── bitcoinmining/
│   │   │               ├── config/            // New package for configuration classes
│   │   │               │   └── SecurityConfig.java  // Your SecurityConfig class
│   │   │               ├── controller/
│   │   │               │   ├── MiningController.java
│   │   │               │   ├── WalletController.java
│   │   │               │   ├── UserController.java   // Controller for user registration and login
│   │   │               │   ├── RegistrationController.java  // Separate controller for registration
│   │   │               │   ├── LoginController.java  // Separate controller for login
│   │   │               │   ├── TransactionController.java
│   │   │               │   └── HomeController.java  // Controller for home page
│   │   │               ├── model/
│   │   │               │   ├── Block.java
│   │   │               │   ├── Wallet.java
│   │   │               │   ├── User.java
│   │   │               │   └── Transaction.java
│   │   │               ├── repository/
│   │   │               │   ├── UserRepository.java
│   │   │               │   └── TransactionRepository.java
│   │   │               ├── service/
│   │   │               │   ├── MiningService.java
│   │   │               │   ├── WalletService.java
│   │   │               │   ├── UserService.java
│   │   │               │   ├── TransactionService.java
│   │   │               │   ├── ConfigurationService.java
│   │   │               │   ├── LoggingService.java
│   │   │               │   ├── TransactionServiceImpl.java
│   │   │               │   └── UserServiceImpl.java
│   │   │               └── BitcoinMiningApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── templates/             // Folder for Thymeleaf templates
│   │           ├── registration.html // Registration page
│   │           ├── login.html        // Login page
│   │           ├── home.html         // Home page
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── bitcoinmining/
│                       └── service/
│                           ├── MiningServiceTest.java
│                           ├── WalletServiceTest.java
│                           ├── UserServiceTest.java
│                           ├── TransactionServiceTest.java
│                           ├── ConfigurationServiceTest.java
│                           └── LoggingServiceTest.java
└── pom.xml

```

  
  
## Setup

### 1. Clone the repository:
       git clone https://github.com/Hugs-4-Bugs/Bitcoin-Mining-App.git

### 2. Navigate to the project directory:
       cd BitcoinMiningApp

### 3. Build the project using Maven:
       mvn clean install

### 4. Run the application:
       mvn spring-boot:run


   

## Usage

*  Access the application through the provided RESTful API endpoints.  
*  Use the provided controllers to interact with different features of the application.




  
## Dependencies

* Spring Boot
* BitcoinJ
* MySQL Connector/J
* Spring Boot Starter Test
* Spring Boot DevTools


  

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.



## License

This project is licensed under the MIT License. See the LICENSE file for details.

