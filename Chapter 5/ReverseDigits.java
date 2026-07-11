// 5.26  Write a method that takes an integer and returns it with its digits reversed (e.g. 7631 → 1367). Incorporate it into an application that reads a value and displays the result.

import java.util.Scanner;
 
public class ReverseDigits {
 
    public static int reverseDigits(int number) {
        int reversed = 0;
 
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number = number / 10;
        }
 
        return reversed;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
 
        System.out.println("Reversed: " + reverseDigits(number));
    }
}

