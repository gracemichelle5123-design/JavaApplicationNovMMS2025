// 8.17
 import java.util.Scanner;

enum Cell { X, O, EMPTY }

public class TicTacToe {
    private Cell[][] board = new Cell[3][3];

    public TicTacToe() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = Cell.EMPTY;
    }

    public void printBoard() {
        for (Cell[] row : board) {
            for (Cell c : row) System.out.print(c + " ");
            System.out.println();
        }
    }
}