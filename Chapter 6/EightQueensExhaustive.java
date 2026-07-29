// (b) Exhaustive brute force -- systematically try every column for row 0, then every column for row 1, and so on (in order, not randomly), backing out of a row as soon as it conflicts with a row already placed:
public class EightQueensExhaustive {
    static int[] columns = new int[8];
    static long attempts = 0;
 
    public static void main(String[] args) {
        boolean found = placeQueen(0);
        System.out.println("Exhaustive search examined " + attempts + " placements.");
    }
 
    static boolean placeQueen(int row) {
        if (row == 8) return true; // all 8 rows filled validly
 
        for (int col = 0; col < 8; col++) {
            attempts++;
            columns[row] = col;
            if (isValidSoFar(row)) {
                if (placeQueen(row + 1)) return true;
            }
        }
        return false;
    }
 
    static boolean isValidSoFar(int row) {
        for (int prev = 0; prev < row; prev++) {
            if (columns[prev] == columns[row]) return false;
            if (Math.abs(columns[prev] - columns[row]) == Math.abs(prev - row)) return false;
        }
        return true;
    }
}
