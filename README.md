## 💻 Bank Account Exception Handling Project

### 📘 Overview

This is a **Java console application** that simulates a simple **bank account system**, focused on demonstrating **exception handling**, **domain-driven design principles**, and **layered architecture**.

It was developed as a practical exercise to strengthen object-oriented programming concepts, domain validation, and the use of custom exceptions for business logic.

---

### 🧠 Main Concepts Applied

| Concept                   | Description                                                                                                                                |
| ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| **Domain Exceptions**     | Custom exceptions like `LimitExceededException`, `NotEnoughBalanceException`, and a generic `DomainException` extending `RuntimeException` |
| **Exception Propagation** | Checked vs Unchecked exception handling                                                                                                    |
| **Service Layer**         | Business logic isolated in `AccountService`                                                                                                |
| **Controller Layer**      | Centralized exception handling, maintaining a clean program flow                                                                           |
| **Encapsulation**         | Private attributes with controlled access through methods                                                                                  |
| **Input Validation**      | Prevents invalid data and ensures application consistency                                                                                  |

---

### 🧩 Project Structure

```
src/
├── application/
│   ├── Main.java
│   └── Controller.java
│
├── model/
│   └── entities/
│       └── Account.java
│
├── services/
│   └── AccountService.java
│
└── exceptions/
    ├── DomainException.java
    ├── LimitExceededException.java
    └── NotEnoughBalanceException.java
```

---

### ⚙️ How It Works

1. The user provides initial account data (number, holder, balance, and withdraw limit).
2. The system allows a withdraw operation.
3. If the user exceeds the withdraw limit or balance, a **custom exception** is thrown and handled gracefully in the controller.
4. The program continues its execution, showing the new balance or an error message if necessary.

---

### 🧾 Example Output

```
Enter account number: 1234
Enter holder name: Raphael
Enter initial balance: 1000
Enter withdraw limit: 500

Enter amount for withdraw: 600
Withdraw Error: Withdraw limit exceeded!

Program finished successfully.
```

---

### 🧱 Technologies Used

* Java SE 17
* Object-Oriented Programming (OOP)
* Exception Handling
* Layered Architecture (Application / Service / Domain / Exception)

---

### 👨‍💻 About the Developer

**Raphael Feijó Salles**
📍 Curitiba, Brazil
🎯 Aspiring Java Developer passionate about backend development, OOP, and learning software architecture.

---

### 🏷️ License

This project is open-source and free for educational purposes.

---
