// 6.21  
public class KnightsTourBasic {
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[][] board = new int[8][8];
 
    public static void main(String[] args) {
        int currentRow = 4, currentColumn = 4;
        int moveCount = 1;
        board[currentRow][currentColumn] = moveCount;
 
        boolean stuck = false;
        while (!stuck && moveCount < 64) {
            boolean moved = false;
            for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
                int nextRow = currentRow + vertical[moveNumber];
                int nextColumn = currentColumn + horizontal[moveNumber];
 
                if (validMove(nextRow, nextColumn)) {
                    currentRow = nextRow;
                    currentColumn = nextColumn;
                    moveCount++;
                    board[currentRow][currentColumn] = moveCount;
                    moved = true;
                    break;
                }
            }
            if (!moved) stuck = true;
        }
        System.out.println("The knight made " + moveCount + " moves out of 64.");
    }
 
    static boolean validMove(int row, int column) {
        return row >= 0 && row < 8 && column >= 0 && column < 8 && board[row][column] == 0;
    }
}