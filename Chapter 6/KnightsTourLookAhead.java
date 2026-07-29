
import java.util.List;
import java.util.ArrayList;
 
public class KnightsTourLookAhead {
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[][] board = new int[8][8];
    static int[][] accessibility = new int[8][8];
 
    public static void main(String[] args) {
        initializeAccessibility();
 
        int currentRow = 4, currentColumn = 4;
        int moveCount = 1;
        board[currentRow][currentColumn] = moveCount;
        reduceAccessibility(currentRow, currentColumn);
 
        boolean stuck = false;
        while (!stuck && moveCount < 64) {
            List<int[]> tied = new ArrayList<>();
            int best = -1;
 
            for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
                int nextRow = currentRow + vertical[moveNumber];
                int nextColumn = currentColumn + horizontal[moveNumber];
 
                if (validMove(nextRow, nextColumn)) {
                    int acc = accessibility[nextRow][nextColumn];
                    if (best == -1 || acc < best) {
                        best = acc;
                        tied.clear();
                        tied.add(new int[]{nextRow, nextColumn});
                    } else if (acc == best) {
                        tied.add(new int[]{nextRow, nextColumn});
                    }
                }
            }
 
            if (tied.isEmpty()) {
                stuck = true;
            } else {
                int bestRow = tied.get(0)[0], bestColumn = tied.get(0)[1], bestLookAhead = Integer.MAX_VALUE;
                for (int[] candidate : tied) {
                    int sum = 0;
                    for (int m = 0; m < 8; m++) {
                        int r = candidate[0] + vertical[m], c = candidate[1] + horizontal[m];
                        if (r >= 0 && r < 8 && c >= 0 && c < 8) sum += accessibility[r][c];
                    }
                    if (sum < bestLookAhead) {
                        bestLookAhead = sum;
                        bestRow = candidate[0];
                        bestColumn = candidate[1];
                    }
                }
                currentRow = bestRow;
                currentColumn = bestColumn;
                moveCount++;
                board[currentRow][currentColumn] = moveCount;
                reduceAccessibility(currentRow, currentColumn);
            }
        }
        System.out.println("The knight made " + moveCount + " moves out of 64.");
    }
 
    static void initializeAccessibility() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                int count = 0;
                for (int m = 0; m < 8; m++) {
                    int r = row + vertical[m], c = col + horizontal[m];
                    if (r >= 0 && r < 8 && c >= 0 && c < 8) count++;
                }
                accessibility[row][col] = count;
            }
        }
    }
 
    static void reduceAccessibility(int row, int column) {
        for (int m = 0; m < 8; m++) {
            int r = row + vertical[m], c = column + horizontal[m];
            if (r >= 0 && r < 8 && c >= 0 && c < 8) accessibility[r][c]--;
        }
    }
 
    static boolean validMove(int row, int column) {
        return row >= 0 && row < 8 && column >= 0 && column < 8 && board[row][column] == 0;
    }
}
