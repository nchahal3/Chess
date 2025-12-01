# Chess (Java)

A fully implemented Chess game built in Java, featuring both a command-line version and a complete GUI version.  
The project demonstrates object-oriented design, game-state management, move validation, and interactive UI handling.

## Features
- Complete chess rule implementation (movement, turn logic, capturing, check/checkmate detection)
- Two playable modes:
  1. **CLI Version** — lightweight terminal-based gameplay
  2. **GUI Version** — interactive board with piece rendering and user input handling
- Object-oriented architecture (Board, Pieces, Game Manager, Move Validator, etc.)
- Clear separation of game logic and UI layers
- Modular and maintainable codebase

## Running the Game

### **Command Line Version**
1. Compile all Java files.
2. Run the `Game` class.
3. Moves use chess coordinates:
   - X-axis = A–H  
   - Y-axis = 0–7  
4. Formats moves as:  
   `oldPosition,newPosition`  
   Example:  
   `A1,A4`

### **GUI Version**
1. Compile and download all Java source files.
2. Run the `GUI2` class.
3. An interactive window will open with a playable chessboard.

## Tech Stack
- **Java**
- Java Swing for GUI
- OOP architecture
- Custom board rendering and input handling
