# 🚀 Java Object-Oriented Programming (OOP) Showcase

Welcome to this repository! This project showcases core **Object-Oriented Programming (OOP)** concepts in Java, divided into two primary topic modules: basic class encapsulations/banking simulation and geometry shape modeling illustrating Abstraction, Encapsulation, Inheritance, and Polymorphism.

---

## 📚 Table of Contents
- [📌 Overview](#-overview)
- [📂 Module 1: Bank System (Array & Basic OOP Concepts)](#-module-1-bank-system-array--basic-oop-concepts)
- [📐 Module 2: Geometry Calculator (OOP Fundamentals)](#-module-2-geometry-calculator-oop-fundamentals)
- [⚙️ How to Compile & Run](#️-how-to-compile--run)
- [🛠️ Prerequisites](#️-prerequisites)

---

## 📌 Overview

This project consists of two distinct interactive console applications:
1. **Bank System**: Demonstrates state management, static members, encapsulation, and menu-driven interaction using `Scanner`.
2. **Geometry Calculator**: Demonstrates class hierarchies, inheritance, method overriding, and dynamic calculation for shapes.

---

## 📂 Module 1: Bank System (Array & Basic OOP Concepts)

This module contains two main files focusing on encapsulated banking state management and static tracking.

### 📄 Files Included:
*   **`Bank.java`**:
    *   **Encapsulation**: Keeps field variables like `balance` private and accessible through public getter (`getBalance()`) and modifier methods (`deposit()`, `withdraw()`).
    *   **Static Members**: Utilizes `bankName` and `totalAccounts` to share global data across all account instances.
*   **`BankDemo.java`**:
    *   **Execution Layer**: Contains the `main` method that runs an interactive loop menu for balance inquiry, deposits, and withdrawals.

---

## 📐 Module 2: Geometry Calculator (Abstraction, Encapsulation, Inheritance & Polymorphism)

This module demonstrates key OOP principles through dynamic shape calculations.

### 🖼️ OOP Pillars Applied:
*   🔒 **Encapsulation**: Attributes such as `warna`, `sisi`, `radius`, and `tinggi` are protected or private with accessors/mutators.
*   🧬 **Inheritance**: `BujurSangkar` and `Lingkaran` inherit from the base class `Bentuk`. `Silinder` further extends `Lingkaran`.
*   🎭 **Polymorphism**: The `printInfo()` method is overridden in subclasses (`BujurSangkar`, `Lingkaran`, `Silinder`) to display specialized behavior and dynamic area/volume calculations.

### 📄 Files Included:
*   **`Bentuk.java`**: The base/parent class representing a general shape with color attributes (`warna`).
*   **`BujurSangkar.java`**: Subclass representing a square; calculates area (`sisi * sisi`).
*   **`Lingkaran.java`**: Subclass representing a circle; calculates area using the formula $\text{PHI} \times r^2$.
*   **`Silinder.java`**: Subclass of `Lingkaran` representing a cylinder; calculates volume by leveraging the parent's base area ($\text{Base Area} \times h$).
*   **`Main.java`**: An interactive CLI application allowing users to input dimensions for different shapes and print dynamic results.

---

## ⚙️ How to Compile & Run

You can compile and run these modules using the Java CLI in your terminal or command prompt.

### 1️⃣ Run the Bank System Simulation
Navigate to the project root directory in your terminal and compile:

```bash
# Compile Bank files
javac Bank.java BankDemo.java

# Run the Bank Demo application
java BankDemo
```

### 2️⃣ Run the Geometry Calculator
Compile all shape classes alongside the `Main` class:

```bash
# Compile Shape classes and Main executable
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java Main.java

# Or compile all .java files at once:
# javac *.java

# Run the Geometry Calculator application
java Main
```

---

## 🛠️ Prerequisites

*   **Java Development Kit (JDK)**: Version 8 or higher.
*   **Terminal / Command Prompt** or any IDE like IntelliJ IDEA, Eclipse, or VS Code.

---
✨ *Happy Coding!*
