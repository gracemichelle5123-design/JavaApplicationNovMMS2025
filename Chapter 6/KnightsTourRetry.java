 // (c) Retry until one tour finally completes. Full program, including attemptTour (same logic as part (a)/(b)):

import java.util.Random;
 
public class KnightsTourRetry {
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
 
    public static void main(String[] args) {
        Random rand = new Random();
        int attempts = 0, moves;
 
        do {
            attempts++;
            moves = attemptTour(rand);
        } while (moves < 64);
 
        System.out.println("Took " + attempts + " attempts to complete a full tour.");
    }
 
    static int attemptTour(Random rand) {
        int[][] board = new int[8][8];
        int currentRow = 4, currentColumn = 4, moveCount = 1;
        board[currentRow][currentColumn] = moveCount;
 
        boolean stuck = false;
        while (!stuck && moveCount < 64) {
            int[] tryOrder = shuffledMoveOrder(rand);
            boolean moved = false;
 
            for (int m : tryOrder) {
                int nextRow = currentRow + vertical[m];
                int nextColumn = currentColumn + horizontal[m];
                if (nextRow >= 0 && nextRow < 8 && nextColumn >= 0 && nextColumn < 8
                        && board[nextRow][nextColumn] == 0) {
                    currentRow = nextRow;
                    currentColumn = nextColumn;
                    board[currentRow][currentColumn] = ++moveCount;
                    moved = true;
                    break;
                }
            }
            if (!moved) stuck = true;
        }
        return moveCount;
    }
 
    static int[] shuffledMoveOrder(Random rand) {
        int[] order = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 7; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = order[i]; order[i] = order[j]; order[j] = temp;
        }
        return order;
    }
}
