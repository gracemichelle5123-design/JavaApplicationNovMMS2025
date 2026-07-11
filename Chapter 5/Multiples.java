// 5.16  Write a method isMultiple that determines, for a pair of integers, whether the second is a multiple of the first. Incorporate it into an application that inputs a series of pairs of integers.

import java.util.Scanner;
 
public class Multiples {
 
    public static boolean isMultiple(int num1, int num2) {
        return (num2 % num1 == 0);
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter first integer (0 to quit): ");
        int a = input.nextInt();
 
        while (a != 0) {
            System.out.print("Enter second integer: ");
            int b = input.nextInt();
 
            if (isMultiple(a, b)) {
                System.out.println(b + " is a multiple of " + a);
            } else {
                System.out.println(b + " is not a multiple of " + a);
            }
 
            System.out.print("\nEnter first integer (0 to quit): ");
            a = input.nextInt();
        }
    }
}
