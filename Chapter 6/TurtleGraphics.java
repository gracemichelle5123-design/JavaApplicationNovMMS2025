// 6.20  
import java.util.Scanner;
 
public class TurtleGraphics {
    static final int SIZE = 20;
    static int[][] grid = new int[SIZE][SIZE];
    static int turtleRow = 0, turtleCol = 0;
    static int direction = 1; 
    static boolean penDown = false;
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int command;
 
        while (input.hasNextInt() && (command = input.nextInt()) != 9) {
            switch (command) {
                case 1: penDown = true; break;
                case 2: penDown = false; break;
                case 3: direction = (direction + input.nextInt()) % 4; break;
                case 4: move(input.nextInt()); break;
                case 5: printGrid(); break;
            }
        }
    }
 
    static void move(int distance) {
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};
 
        for (int i = 0; i < distance; i++) {
            if (penDown) grid[turtleRow][turtleCol]++;
            turtleRow = (turtleRow + dRow[direction] + SIZE) % SIZE;
            turtleCol = (turtleCol + dCol[direction] + SIZE) % SIZE;
        }
        if (penDown) grid[turtleRow][turtleCol]++;
    }
 
    static void printGrid() {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell == 0 ? " " : "*");
            }
            System.out.println();
        }
    }
}
