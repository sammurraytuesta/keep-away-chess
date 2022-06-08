# KeepAwayChess
Game logic developed through Keep Away Chess rules and implemented using 2D arrays designed to execute gameplay.

In this game, 2 players take turns putting pieces on a standard 8 x 8 chess board, in such a way that they can not be taken by any other piece. The first player who places a piece on the board that can be taken by another piece loses the game.

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)](https://www.python.org/) [![java-version](https://img.shields.io/badge/Java%20SE-14-blue.svg)](https://shields.io/) [![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg) [![GitHub](https://badgen.net/badge/icon/github?icon=github&label)](https://github.com/sammurraytuesta)

## Game Mode
After initializing the main driver, the program will prompt you for a game mode.

You can either play as a Bishop (diagonal movements) or a Rook (horizontal or vertical movements).

```
Would you like to play as Bishops or Rooks? (B/R) B
```

## Game Play
```
Player 1's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 4
```

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

```
Player 2's turn!
Enter row [0 to 7]: 5
Enter col [0 to 7]: 2
```

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

```
Sorry, you lose Player 2!

Do you want to play again? (Y/N) Y
```

```
Would you like to play as Bishops or Rooks? (B/R) R
```

```
Player 1's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 1
```

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

```
Player 2's turn!
Enter row [0 to 7]: 3
Enter col [0 to 7]: 5
```

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


```
Sorry, you lose Player 2!

Do you want to play again? (Y/N) N
```

```
Someone is a sore loser...
```
