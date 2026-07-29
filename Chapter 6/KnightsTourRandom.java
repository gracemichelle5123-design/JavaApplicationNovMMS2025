// 6.22  Knight's Tour: Brute-Force Approaches
import java.util.Random;
 
public class KnightsTourRandom {
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
 
    public static void main(String[] args) {
        int fullTours = 0;
        Random rand = new Random();
 
        for (int trial = 0; trial < 1000; trial++) {
            if (attemptTour(rand) == 64) {
                fullTours++;
            }
        }
        System.out.println("Full tours out of 1000: " + fullTours);
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

