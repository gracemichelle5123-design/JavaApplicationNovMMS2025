// 2.30 Separating Digits of a 5-Digit Number

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = input.nextInt();

        int d1 = number / 10000;
        int d2 = number % 10000 / 1000;
        int d3 = number % 1000 / 100;
        int d4 = number % 100 / 10;
        int d5 = number % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", d1, d2, d3, d4, d5);
    }
}
