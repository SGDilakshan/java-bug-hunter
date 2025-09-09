# Java Bug Hunter

## Overview  
**Java Bug Hunter** is a hands-on learning repository built from exercises conducted in the **GOMATHINAYAGAM (Goms) “Code IO – Tamil” Live Java Workshop**.  

This project provides a structured way for beginners to practice and master **Java fundamentals**, including:  
- Core Java concepts (variables, loops, conditions, functions)  
- Object-Oriented Programming (OOP) principles  
- Collections and data structures  
- Multithreading  
- AWT & Swing for basic GUI development
  
Each week introduces a new set of real-world inspired mini-problems to help learners apply Java concepts in practice.  

Currently, the repository contains completed tasks from **Week 1**. Future weeks will be added as separate folders following the same structure.

---

## Week 1: Bug Hunter Tasks

> (These tasks do not require user input. Values can be assigned in the code for testing.)

### 1. The Light Bulb Test
- **Description:** A smart light bulb switches ON only if an even number is entered; otherwise, it stays OFF.  
- **Output:** `"ON"` if even, `"OFF"` if odd.  
- **Sample Input/Output:** `Input: 4 → Output: ON` , `Input: 7 → Output: OFF` , `Input: 0 → Output: ON`

### 2. The Bank Balance
- **Description:** Shows the status of a customer's bank account.
- **Output:** `"Positive Balance"` if balance > 0 , `"Overdraft"` if balance < 0 , `"Zero Balance"` if balance == 0
- **Sample Input/Output:** `Input: 250 → Output: Positive Balance` , `Input: 0 → Output: Zero Balance` , `Input: -120 → Output: Overdraft`

### 3. The Faster Runner
- **Description:** Compares the times of two friends running a race.
- **Output:** `"Arjun"` if Arjun is faster, `"Varun"` if Varun is faster, `"Tie"` if equal
- **Sample Input/Output:** `Input: 12 10 → Output: Varun` , `Input: 15 20 → Output: Arjun` , `Input: 18 18 → Output: Tie`

### 4. The Biggest Treasure
- **Description:** Determines the largest treasure among three chests.
- **Output:** Largest value
- **Sample Input/Output:** `Input: 10 25 7 → Output: 25` , `Input: 5 5 9 → Output: 9` , `Input: 100 50 75 → Output: 100`

### 5. The Magic Calendar
- **Description:** Determines if a year is a leap year.
- **Output:** `"Leap Year"` or `"Not a Leap Year"`
- **Sample Input/Output:** `Input: 2020 → Output: Leap Year` , `Input: 1900 → Output: Not a Leap Year` , `Input: 2000 → Output: Leap Year`

### 6. The Report Card
- **Description:** Generates a report card based on marks.
- **Output:** `"A"` if marks >= 90 , `"B"` if 75 <= marks < 90 , `"C"` if 50 <= marks < 75 , `"Fail"` if marks < 50
- **Sample Input/Output:** `Input: 92 → Output: A` , `Input: 76 → Output: B` , `Input: 45 → Output: Fail`

### 7. The Robot Assistant
- **Description:** Performs basic arithmetic operations based on input.
Operations: `1 → Addition` , `2 → Subtraction` , `3 → Multiplication` , `4 → Division`
- **Sample Input/Output:** `Input: 10 5, 1 → Output: 15` , `Input: 20 4, 4 → Output: 5` , `Input: 6 7, 3 → Output: 42`

---

### Folder Structure

```
java-bug-hunter/
└── src/
    └── Week_01/
        ├── Q1_LightBulbTest.java
        ├── Q2_BankBalance.java
        ├── Q3_FasterRunner.java
        ├── Q4_BiggestTreasure.java
        ├── Q5_MagicCalendar.java
        ├── Q6_ReportCard.java
        └── Q7_RobotAssistant.java
```
---

### How to Run

#### Clone the repository:
`git clone https://github.com/your-username/java-bug-hunter.git`

#### Navigate to the desired week's folder:
`cd java-bug-hunter/Week_01`

#### Compile and run each Java file:
`javac Q1_LightBulbTest.java`
`java Q1_LightBulbTest`

--- 

### Future Plans
- Add Week 2 tasks with the same structure in a separate folder.
- Include more advanced exercises covering Collections, Multithreading, AWT, and Swing.

---

### Author  
**Sivanathan Dilakshan**  
Software Engineer Intern @ QTechy | Third-Year B.Sc. (Hons) Software Engineering Undergraduate @ University of Kelaniya  
📞 Phone: +94 77 489 2145  | 📧 Email: [dilakshan.info@gmail.com](mailto:dilakshan.info@gmail.com)  
🔗 LinkedIn: [https://www.linkedin.com/in/sivanathandilakshan](https://www.linkedin.com/in/sivanathandilakshan)

