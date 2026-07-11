// 5.9  Write an application that reads double values and uses y = Math.floor(x + 0.5) to round each number to the nearest integer. Display both the original and rounded number.

import java.util.Scanner;
 
public class RoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a number (-1 to quit): ");
        double x = input.nextDouble();
 
        while (x != -1) {
            double y = Math.floor(x + 0.5);
            System.out.println("Original: " + x + "   Rounded: " + y);
 
            System.out.print("Enter a number (-1 to quit): ");
            x = input.nextDouble();
        }
    }
}
