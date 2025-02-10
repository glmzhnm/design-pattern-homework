# SOLID Adventure Game

## Overview
My project is a simple adventure game implemented in Java, following the SOLID principles for clean and maintainable code. My game consists of a player fighting enemies, collecting items, and progressing through levels.

## Features
- **Player Management:** Tracks player's health, experience, and inventory.
- **Combat System:** Handles battles between the player and different enemy types.
- **Item Management:** Allows the player to collect and use various items.
- **Level Progression:** Manages level transitions and game progression.
- **Score Tracking:** Displays final game results.

## Project Structure
```
📂 design pattern
│── 📂 src
│   ├── 📂 player
│   │   ├── Player.java
│   ├── 📂 combat
│   │   ├── CombatManager.java
│   ├── 📂 enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Zombie.java
│   │   ├── Vampire.java
│   ├── 📂 items
│   │   ├── ItemManager.java
│   │   ├── GoldCoin.java
│   │   ├── HealthElixir.java
│   │   ├── MagicScroll.java
│   ├── 📂 level
│   │   ├── LevelManager.java
│   ├── 📂 score
│   │   ├── ScoreManager.java
│   ├── MainGame.java
│
│──   TEXT.txt
```

## SOLID Principles Applied
- **Single Responsibility Principle (SRP):** Each class has a single, well-defined responsibility.
- **Open/Closed Principle (OCP):** The system allows adding new enemies and items without modifying existing code.
- **Liskov Substitution Principle (LSP):** Derived classes (e.g., different enemies and items) extend base classes without altering expected behavior.
- **Interface Segregation Principle (ISP):** Items and enemies have distinct interfaces to prevent unnecessary dependencies.
- **Dependency Inversion Principle (DIP):** High-level modules do not depend on low-level modules; they rely on abstractions.



