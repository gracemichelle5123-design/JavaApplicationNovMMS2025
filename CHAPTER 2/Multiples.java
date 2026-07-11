// 2.26 Multiples

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        if (a % b == 0)
            System.out.printf("%d is a multiple of %d%n", a, b);
        if (a % b != 0)
            System.out.printf("%d is not a multiple of %d%n", a, b);
    }
}
