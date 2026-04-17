# 🌊 Point Absorber Wave Energy Simulation System

## 📌 Overview

This project is a **web-based simulation platform** for a *point absorber wave energy converter*. It demonstrates how ocean wave motion can be converted into electrical energy using a **spring-based mechanical system**.

The system consists of:

* ⚙️ A **Spring Boot backend** for physics-based calculations
* 💻 A **React frontend** for user interaction and visualization

---

## 🎯 Objectives

* Simulate wave energy conversion using a spring mechanism
* Allow users to input wave and system parameters
* Calculate force and estimated power output
* Provide a foundation for future real-time and graphical simulations

---

## 🧠 System Concept

The point absorber works by converting vertical wave motion into mechanical energy using a spring system.

### Hooke’s Law:

[
F = kx
]

### Power Estimation:

[
P = F \cdot v
]

Where:

* ( k ) = spring constant
* ( x ) = displacement
* ( v ) = velocity

---

## 🏗️ Tech Stack

### 🔹 Backend (Spring Boot)

* Java
* Spring Boot (REST API)
* Maven

### 🔹 Frontend (React)

* React.js
* JavaScript (Fetch API)
* Optional: Recharts (for graphs)

---

## 🔗 System Architecture

```
React Frontend  →  Spring Boot API  →  Physics Calculations
       ↑                                         ↓
       ←────────────── JSON Response ─────────────
```

---

## 🚀 Getting Started

### ✅ Prerequisites

* Java JDK 17+
* Node.js & npm
* Maven

---

## ⚙️ Backend Setup (Spring Boot)

1. Navigate to backend folder:

```bash
cd backend
```

2. Run the application:

```bash
mvn spring-boot:run
```

3. Server will start at:

```
http://localhost:8080
```

---

## 🎨 Frontend Setup (React)

1. Navigate to frontend folder:

```bash
cd point-absorber-ui
```

2. Install dependencies:

```bash
npm install
```

3. Run the app:

```bash
npm start
```

4. Open browser:

```
http://localhost:3000
```

---

## 📡 API Endpoint

### 🔹 POST `/api/simulate`

#### Request:

```json
{
  "waveHeight": 2.5,
  "frequency": 0.8,
  "springConstant": 1200
}
```

#### Response:

```json
{
  "force": 3000,
  "power": 1500
}
```

---

## 📊 Features

* User input for wave parameters
* Real-time simulation results
* Backend physics calculations
* Simple and extendable architecture

---

## 🔮 Future Improvements

* 🌊 Wave animation (sinusoidal motion)
* 📈 Graph visualization (power vs time)
* ⚡ Generator efficiency modeling
* 📍 Deployment with cloud hosting
* 📊 Real-world ocean data integration

---

## 👥 Team

* University of Moratuwa Engineering Students
* Project for Entrepreneurship / Energy Systems

---

## 📄 License

This project is for academic and educational purposes.

---

## 💡 Notes

This is a simplified simulation. Real-world wave energy systems require:

* Hydrodynamic modeling
* Non-linear motion equations
* Generator efficiency analysis

---
