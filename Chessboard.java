import java.util.Scanner;

public class Chessboard {
    Scanner input = new Scanner(System.in);
    private String[][] spaces;
    private String pieceType;

    // constructor
    public Chessboard(int x, int y) {
        spaces = new String[x][y];
    }

    // setPiece
    public void setPiece(String pieceType) {
        if (isValidPiece(pieceType)) {
            this.pieceType = pieceType.toUpperCase();
        } 
        else {
            System.out.print("\nPlease enter a valid piece! (B/R)");
            gameSetUp();
        }
    }

    // isValidPiece
    public boolean isValidPiece(String pieceType) {
        boolean result = false;

        if (pieceType.equalsIgnoreCase("R")) {
            result = true;
        } 
        else if (pieceType.equalsIgnoreCase("B")) {
            result = true;
        } 
        else {
            result = false;
        }
        return result;
    }

    // getPiece
    public String getPiece() {
        return pieceType;
    }

    // gameSetUp
    public void gameSetUp() {
        System.out.print("\nWould you like to play as Bishops or Rooks? (B/R)");
        setPiece(input.next());
    }

    // printBoard
    public void print() {
        String row;
        String border = "+---+---+---+---+---+---+---+---+";

        for (int i = 0; i < spaces.length; i++) {
            row = "";

            System.out.println(border);

            for (int j = 0; j < spaces.length; j++) {
                if (spaces[i][j] != null) {
                    row += "| " + spaces[i][j] + " ";
                } else {
                    row += "|   ";
                }

            }
            row += "|";
            System.out.println(row);
        }
        System.out.println(border);
    }

    // clearBoard
    public void clearBoard() {
        for (int i = 0; i < spaces.length; i++) {
            for (int j = 0; j < spaces.length; j++) {
                spaces[i][j] = null;
            }
        }
    }

    // checks if piece can be taken, returns true if user can place piece without
    // being captured
    public boolean isSpaceOpen(int row, int column) {
        boolean spaceOpen = true;

        if (pieceType.equals("R")) {
            spaceOpen = rookMovement(row, column);
        } 
        else if (pieceType.equals("B")) {
            spaceOpen = bishopMovement(row, column);
        } 
        else {
            spaceOpen = false;
        }

        return spaceOpen;
    }

    // places piece if it is in bounds and cannot be captured, then prints board
    public boolean placePiece(int row, int column) {
        boolean piecePlaced = true;

        if (isSpaceOpen(row, column)) {
            spaces[row][column] = pieceType;
        } 
        else if (!isSpaceOpen(row, column)) {
            spaces[row][column] = "X";
            piecePlaced = false;
        }
        return piecePlaced;
    }

    public boolean inBounds(int input) {
        if (input >= spaces.length || input < 0) {
            return false;
        } 
        else {
            return true;
        }
    }

    // checks the row and column for other pieces, returns false if other pieces
    private boolean rookMovement(int row, int column) {
        boolean spaceOpen = true;

        for (int i = 0; i < spaces.length; i++) {
            if (spaces[row][i] != null || spaces[i][column] != null) {
                spaceOpen = false;
            }
        }

        return spaceOpen;
    }

    // checks diagonally for other pieces, returns false if other pieces
    public boolean bishopMovement(int row, int column) {
        int diagonal1 = column - row;
        int diagonal2 = column + row;
        boolean spaceOpen = true;

        for (int i = 0; i < spaces.length; i++) {

            if (diagonal1 >= 0 && diagonal1 < spaces.length && spaces[i][diagonal1] != null) {
                spaceOpen = false;
            }
            if ((diagonal2) >= 0 && (diagonal2) < spaces.length && spaces[i][diagonal2] != null) {
                spaceOpen = false;
            }

            diagonal1++;
            diagonal2--;
        }
        return spaceOpen;
    }

    // playAgain
    public boolean playAgain() {
        boolean result = true;

        while (true) {
            System.out.print("Do you want to play again? (Y/N)");
            String answer = input.next();

            if (!isValidAnswer(answer)) {
                System.out.println("\nPlease enter a valid response!");
            } 
            else if (isValidAnswer(answer)) {
                if (answer.equalsIgnoreCase("Y")) {
                    clearBoard();
                } 
                else if (answer.equalsIgnoreCase("N")) {
                    System.out.println("\nSomeone is a sore loser...");
                    result = false;
                }
                break;
            }
        }
        
        return result;
    }

    // isValidAnswer
    public boolean isValidAnswer(String answer) {
        boolean result = false;

        if (answer.equalsIgnoreCase("Y")) {
            result = true;
        } 
        else if (answer.equalsIgnoreCase("N")) {
            result = true;
        } 
        else {
            result = false;
        }

        return result;
    }
}
