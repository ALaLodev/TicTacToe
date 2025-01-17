# 📱 Tic Tac Toe - The Ultimate Real-Time Multiplayer Game

**Tic Tac Toe** es una moderna aplicación de Android que ofrece la experiencia clásica del juego Tic Tac Toe en tiempo real entre dos jugadores. Utilizando tecnologías avanzadas, como **Jetpack Compose**, **MVVM**, **Dagger Hilt** para la inyección de dependencias y **Firebase Realtime Database**, esta aplicación permite a los usuarios jugar entre sí sin importar la distancia.

<p align="center">  
  <img src="/app/screenshots/Tic1.png" alt="Main Screen" width="20%" style="margin-right: 40dp"> 
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <!-- 10 non-breaking spaces --> 
  <img src="/app/screenshots/Tic2.png" alt="Game Screen" width="20%" style="margin-right: 40dp"> 
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <!-- 10 non-breaking spaces --> 
  <img src="/app/screenshots/Tic3.png" alt="Game Play" width="20%" style="margin-right: 40dp">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <!-- 10 non-breaking spaces --> 
   <img src="/app/screenshots/Tic4.png" alt="Game Play" width="20%" style="margin-right: 40dp">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <!-- 10 non-breaking spaces --> 
   <img src="/app/screenshots/Tic5.png" alt="Game Play" width="20%" style="margin-right: 40dp">
</p>  

---

## 🌟 Key Features

- **Real-time multiplayer**: Play against another person in real-time by sharing a unique game ID.
- **Intuitive UI**: A smooth and user-friendly interface built using **Jetpack Compose**.
- **Seamless game experience**: Instant game updates using **Firebase Realtime Database** to ensure no delay in moves.
- **Efficient data management**: Solid architecture with MVVM ensuring clean, maintainable, and scalable code.
- **Cross-device gameplay**: Easily share game IDs via WhatsApp or other platforms for a smooth, interactive experience.

### ✨ What makes Tic Tac Toe stand out?

1. **Technical innovation**: Implements best practices in Android development, ensuring a scalable and maintainable codebase.
2. **Real-time multiplayer**: Unique game IDs allow friends to easily join each other's games from different devices.
3. **Project sustainability**: Designed to be easy to extend, making it simple to add new features or enhancements in the future.

---

## 🏗️ Architecture

Tic Tac Toe uses the **MVVM (Model-View-ViewModel)** architecture pattern, ensuring:

- Clear separation of business logic and UI.
- Data updates are reactive, allowing seamless updates between the UI and game logic.
- Easy testing, scalability, and maintainability.

### 🔧 Core Technologies Used

- **Firebase Realtime Database**: For real-time game synchronization between players.
- **Dagger Hilt**: Dependency injection to manage resources efficiently and reduce boilerplate code.
- **Jetpack Compose**: For building modern and responsive user interfaces.
- **Kotlin**: The primary language ensuring concise, safe, and efficient code.
- **ViewModel and LiveData**: For managing UI-related data lifecycle-aware and in a reactive way.
- **Coroutines**: To handle asynchronous tasks, ensuring smooth user experience during gameplay.

---

## 🚀 How to Play

1. **Create a Game**: One player creates a new game, which generates a unique game ID.
2. **Share the Game ID**: The player shares the game ID with the other player via WhatsApp or any other messaging platform.
3. **Join a Game**: The second player uses the game ID to join the game in real-time and start playing.
4. **Start Playing**: Both players take turns to make their move and the game automatically updates in real-time.

---

## 🛠️ Installation

To run this project locally:

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/tic-tac-toe.git
    ```

2. Open the project in **Android Studio**.

3. Build and run the project on an Android device or emulator.

---

## 🤝 Contributing

Feel free to fork the repository and submit pull requests. Contributions, bug reports, and feature requests are welcome.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
