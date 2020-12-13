import java.util.Scanner;

public class KeepAwayChess {
    private Scanner input = new Scanner(System.in);
    private Chessboard board = new Chessboard(8, 8);
    private String player;
    private int row;
    private int col;

    public void play() {
        while (true) {
            // gameSetUp
            board.gameSetUp();

            // turnCount
            int turn = 1;
            while (true) {

                if (turn % 2 == 0) {
                    player = "Player 2";
                } else {
                    player = "Player 1";
                }

                // playerTurn
                System.out.println("\n" + player + "'s turn!");
                // row
                System.out.print("Enter row [0 to 7]: ");
                row = validateInt(input);
                // col
                System.out.print("Enter col [0 to 7]: ");
                col = validateInt(input);

                if (board.placePiece(row, col)){
                    board.print();
                    turn += 1;
                }
                else if (!board.placePiece(row, col)){
                    board.print();
                    System.out.println("\nSorry, you lose " + player + "!\n");
                    break;
                }
            }
            // playAgain 
            if (!board.playAgain()){
                break;
            }

        }
    }

    public int validateInt(Scanner input) {
        int place;

        while(!input.hasNextInt()) {
            System.out.print("Please enter an integer [0 to 7]: ");
            input.next();
        }

        place = input.nextInt();

        if (!board.inBounds(place)){
            System.out.print("Please enter an integer [0 to 7]: ");
            return validateInt(input);
        }
        else{
            return place;
        }
    }

}
