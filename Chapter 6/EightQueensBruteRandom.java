// 6.25  Eight Queens: Brute Force
// (a) Random brute force:

import java.util.Random;
 
public class EightQueensBruteRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] columns = new int[8]; // columns[row] = column of the queen in that row
        boolean solved = false;
        long attempts = 0;
 
        while (!solved) {
            attempts++;
            for (int row = 0; row < 8; row++) {
                columns[row] = rand.nextInt(8);
            }
            solved = isValid(columns);
        }
        System.out.println("Found a solution after " + attempts + " random attempts.");
    }
 
    static boolean isValid(int[] columns) {
        for (int row1 = 0; row1 < 8; row1++) {
            for (int row2 = row1 + 1; row2 < 8; row2++) {
                if (columns[row1] == columns[row2]) return false;
                if (Math.abs(columns[row1] - columns[row2]) == Math.abs(row1 - row2)) return false;
            }
        }
        return true;
    }
}

