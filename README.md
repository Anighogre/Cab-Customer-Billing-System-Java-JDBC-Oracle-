# 🚖 Cab Customer Billing System (Java + JDBC + Oracle)

A **Java JDBC project** that simulates a **Cab Customer Billing System** using **Oracle Database**.  
The system allows adding customer details, verifying first-time usage, and calculating bills dynamically based on distance and usage history.

---

## 📘 Project Overview

This project demonstrates **JDBC CRUD operations** and **database connectivity** in Java.  
It includes:
- Database connection management using **Oracle JDBC driver**
- Insertion and retrieval of customer records
- Conditional billing logic based on travel distance and first-time usage
- Console-based interaction for user input

---

## 🧩 Class Structure

### 1️⃣ `CabCustomer` (Model)
Represents a cab customer.

**Fields:**
| Field | Type | Description |
|--------|------|-------------|
| customer_Id | int | Unique customer ID |
| customer_Name | String | Customer name |
| source | String | Starting point |
| destination | String | Destination point |
| distance | double | Distance travelled (in km) |
| phoneNo | String | Customer's phone number |

**Methods:**
- Constructor(s)
- Getters & Setters
- `toString()` for displaying customer info

---

### 2️⃣ `ConnectionProvider`
Handles database connectivity.

**Responsibilities:**
- Loads the Oracle JDBC driver using `Class.forName()`
- Provides a **singleton connection** to the database via:
  ```java
  jdbc:oracle:thin:@localhost:1521:xe
