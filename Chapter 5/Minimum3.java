// 5.23  Write a method minimum3 that returns the smallest of three floating-point numbers, using Math.min. Incorporate it into an application that reads three values.

import java.util.Scanner;
 
public class Minimum3 {
 
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
 
        System.out.println("Smallest value: " + minimum3(num1, num2, num3));
    }
}
