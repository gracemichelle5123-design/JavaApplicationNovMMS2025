// 6.24  
public class EightQueensHeuristic {
    static final int SIZE = 8;
    static int[][] board = new int[SIZE][SIZE];
    static boolean[][] attacked = new boolean[SIZE][SIZE];
 
    public static void main(String[] args) {
        int queensPlaced = 0;
 
        while (queensPlaced < SIZE) {
            int bestElim = Integer.MAX_VALUE, bestRow = -1, bestCol = -1;
 
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    if (!attacked[row][col] && board[row][col] == 0) {
                        int elim = eliminationNumber(row, col);
                        if (elim < bestElim) {
                            bestElim = elim;
                            bestRow = row;
                            bestCol = col;
                        }
                    }
                }
            }
 
            if (bestRow == -1) {
                System.out.println("Stuck after placing " + queensPlaced + " queens.");
                break;
            }
 
            board[bestRow][bestCol] = 1;
            markAttacked(bestRow, bestCol);
            queensPlaced++;
        }
        System.out.println("Placed " + queensPlaced + " queens.");
    }
 
    static int eliminationNumber(int row, int col) {
        int count = 1; // the square itself
        for (int i = 0; i < SIZE; i++) {
            if (i != col) count++; // same row
            if (i != row) count++; // same column
        }
        for (int d = -SIZE; d <= SIZE; d++) {
            if (d != 0) {
                if (row+d>=0 && row+d<SIZE && col+d>=0 && col+d<SIZE) count++;
                if (row+d>=0 && row+d<SIZE && col-d>=0 && col-d<SIZE) count++;
            }
        }
        return count;
    }
 
    static void markAttacked(int row, int col) {
        for (int i = 0; i < SIZE; i++) {
            attacked[row][i] = true;
            attacked[i][col] = true;
        }
        for (int d = -SIZE; d <= SIZE; d++) {
            if (row+d>=0 && row+d<SIZE && col+d>=0 && col+d<SIZE) attacked[row+d][col+d] = true;
            if (row+d>=0 && row+d<SIZE && col-d>=0 && col-d<SIZE) attacked[row+d][col-d] = true;
        }
    }
}
