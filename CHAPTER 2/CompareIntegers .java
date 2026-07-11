// 2.16 Comparing Integers

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        if (a > b)
            System.out.printf("%d is larger%n", a);
        if (b > a)
            System.out.printf("%d is larger%n", b);
        if (a == b)
            System.out.println("These numbers are equal");
    }
}
