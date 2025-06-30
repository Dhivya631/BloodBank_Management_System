# 🩸 BloodBank_Management_System

## 📌 Overview
The **Blood Bank Management System** is a Java-based application built using JFrame for the GUI and MySQL for database management. This system helps streamline the operations of a blood bank, including donor registration, blood stock management, appointment scheduling, and blood search. It ensures efficient tracking of blood donations, availability, and appointments, ultimately improving the overall blood donation and transfusion process.

---

## 🔧 Technology

| Technology        | Description                         |
|-------------------|-------------------------------------|
| Java Swing(JFrame)| GUI for the application             |
| MySQL	            | Relational database                 |
| NetBeans IDE	    | Development environment             |
| Apache Tomcat	    | Application server                  |
| JDBC	            | Database connectivity               |

--- 

## ⚙️ System Requirements

text
Java: JDK 8 or above
MySQL: Version 5.6 or above
IDE: Any Java IDE (e.g., Eclipse, IntelliJ IDEA, NetBeans)
Database Connection: MySQL Database configured locally or remotely



---

## 🧩 Modules

1. **Login Module**

- User Authentication: Validates user credentials and redirects based on role (Admin, Donor, Receiver).
- User Registration: New users can register via a form, and their details are saved to the database.
- Forgot Password: Users can reset their password via a secure reset link.

2. **Donor Module**
   
- Admins can add, delete, update, and view donor details.

3. **Blood Bank Module**

- **Find Blood Drives:** Search blood donation events.
- **Book Donation:** Schedule blood donation appointments.
- **Check Availability:** See available blood by type.
- **Order Blood:** Request blood for transfusions.

4. **Stock Module**

- **Add/Update Blood Packets:** Admin can manage blood packets.
- **Add Blood Centers:** Admin can add blood collection centers.

5. **Report Generation**
   
- Reports by Blood Type, City, Blood Center, and Medical History to generate detailed insights.

---

## 🚀 How to Run (with jDeploy)
You can run this app directly with jDeploy:

1. **🛠 Install jDeploy globally:**

```bash
npm install -g jdeploy
```
2. **🔁 Run the App**

```bash
npx bloodbank-app
```

3. **📦 jDeploy Live Package**

**🔗 Published App:**
- https://www.jdeploy.com/~bloodbank-app 
---
## 📁 Directory Structure

```bash
BloodBank_Management_System/
├── src/
├── dist/
│   └── BloodBankSystem.jar
└── README.md
```
