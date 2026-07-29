//2. Write a java method to calculate the average of three numbers.

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
       
        double average = (a + b + c) / 3;
       
        System.out.printf("Average :%f", average);
       
    }
}
