// 2.15 Arithmetic (Sum, Product, Difference, Quotient)

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.printf("Sum is %d%n", a + b);
        System.out.printf("Product is %d%n", a * b);
        System.out.printf("Difference is %d%n", a - b);
        System.out.printf("Quotient is %d%n", a / b);
    }
}
