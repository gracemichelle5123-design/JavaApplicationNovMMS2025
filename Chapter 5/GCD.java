//  5.27  Greatest Common Divisor
// The GCD of two integers is the largest integer that evenly divides both. Write a method gcd using Euclid's algorithm. Incorporate it into an application that reads two values.
// Answer:
// Euclid's algorithm: repeatedly replace the larger number with the remainder of dividing it by the smaller, until the remainder is 0 — whatever's left is the GCD.
import java.util.Scanner;
 
public class GCD {
 
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
 
        System.out.println("GCD: " + gcd(a, b));
    }
}
