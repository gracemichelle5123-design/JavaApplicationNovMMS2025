// 5.21  
import java.util.Scanner;
 
public class DisplayDigits {
 
    public static int quotient(int a, int b) {
        return a / b;
    }
 
    public static int remainder(int a, int b) {
        return a % b;
    }
 
    public static void displayDigits(int number) {
        String digits = "";
 
        while (number > 0) {
            int lastDigit = remainder(number, 10);
            digits = lastDigit + digits;
            number = quotient(number, 10);
        }
 
        for (int i = 0; i < digits.length(); i++) {
            System.out.print(digits.charAt(i));
            if (i < digits.length() - 1) {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
 
        displayDigits(number);
    }
}

