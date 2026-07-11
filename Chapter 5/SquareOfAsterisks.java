// 5.18  Write a method squareOfAsterisks that displays a solid square of asterisks whose side length is given by parameter side. Incorporate it into an application that reads side from the user.
import java.util.Scanner;
 
public class SquareOfAsterisks {
 
    public static void squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++) {
            for (int col = 1; col <= side; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter side length: ");
        int side = input.nextInt();
 
        squareOfAsterisks(side);
    }
}
