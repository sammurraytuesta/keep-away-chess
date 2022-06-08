# KeepAwayChess
Game logic developed through Keep Away Chess rules and implemented using 2D arrays designed to execute gameplay.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)](https://www.python.org/) [![java-version](https://img.shields.io/badge/Java%20SE-14-blue.svg)](https://shields.io/) [![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg) [![GitHub](https://badgen.net/badge/icon/github?icon=github&label)](https://github.com/sammurraytuesta)

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#Game Mode">Game Mode</a></li>
    <li><a href="#Rules">Rules</a></li>
    <li>
      <a href="#Gameplay">Gameplay</a>
      <ul>
        <li><a href="#Bishops">Bishops</a></li>
        <li><a href="#Rooks">Rooks</a></li>
      </ul>
    </li>
    <li><a href="#Thank You!">Thank You!</a></li>
  </ol>
</details>

## Game Mode
After initializing the main driver, the program will prompt you for a game mode.

Both players can either play as **Bishops** (diagonal movements) or **Rooks** (horizontal or vertical movements).
```
Would you like to play as Bishops or Rooks? (B/R) B
```

## Rules

In this game, 2 players take turns putting pieces on a standard 8 x 8 chess board, in such a way that they can not be taken by any other piece. The first player who places a piece on the board that can be taken by another piece loses the game.

Bishops can take any piece diagonal to their position and Rooks can take any piece either horizontal or vertical to its position.

## Gameplay
### Bishops

In this example, the game mode has been set to **Bishops**, meaning pieces placed diagonal of each other will be considered in the range of capture.

The game will first prompt *Player 1* for a row--indexed from 0 (top) to 7 (bottom)--and then a column--indexed from 0 (left) to 7 (right).
```
Player 1's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 4
```
After entries are validated, the board will then print out the position of the piece according to the row and column numbers input by *Player 1*, as well as the first letter of the name of the piece specified in the game mode. (In this example the piece is marked B for Bishop, according to the previously set game mode).
```
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   | B |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
```
The game will then prompt *Player 2* for a row--indexed from 0 (top) to 7 (bottom)--and then a column--indexed from 0 (left) to 7 (right).
```
Player 2's turn!
Enter row [0 to 7]: 5
Enter col [0 to 7]: 2
```
After entries are validated, the board will then print out the position of the piece according to the row and column numbers input by *Player 2* and will determine whether or not that location is in the range of capture. If it **is** in the range of capture, the piece will be placed as an X, if **not** the piece will be placed with the first letter of its name specified in game mode.
```
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   | B |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | X |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
```
If the piece is **not** able to be captured, the game will proceed as normal. If it **is** able to be captured, the game will then terminate and print the following message: 
```
Sorry, you lose Player 2!

Do you want to play again? (Y/N) Y
```
If you wish to play again, the program will run itself again from the very beginning (game mode).

### Rooks 

```
Would you like to play as Bishops or Rooks? (B/R) R
```
In this example, the game mode has been set to **Rooks**, meaning pieces placed horizontal or vertical of each other will be considered in the range of capture.

The game will first prompt *Player 1* for a row--indexed from 0 (top) to 7 (bottom)--and then a column--indexed from 0 (left) to 7 (right).
```
Player 1's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 1
```
After entries are validated, the board will then print out the position of the piece according to the row and column numbers input by *Player 1*, as well as the first letter of the name of the piece specified in the game mode. (In this example the piece is marked R for Rook, according to the previously set game mode).
```
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | R |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
```
The game will then prompt *Player 2* for a row--indexed from 0 (top) to 7 (bottom)--and then a column--indexed from 0 (left) to 7 (right).
```
Player 2's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 5
```
After entries are validated, the board will then print out the position of the piece according to the row and column numbers input by *Player 2* and will determine whether or not that location is in the range of capture. If it **is** in the range of capture, the piece will be placed as an X, if **not** the piece will be placed with the first letter of its name specified in game mode.
```
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   | R |   |   |   | X |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
```
If the piece is **not** able to be captured, the game will proceed as normal. If it **is** able to be captured, the game will then terminate and print the following message: 
```
Sorry, you lose Player 2!

Do you want to play again? (Y/N) N
```
As you can see, in this second example, *Player 2* lost again!
In the case that you decide to stop playing, the program will then terminate with the following outgoing message:
```
Someone is a sore loser...
```
## Thank You!
I hope you enjoy playing Keep Away Chess!
