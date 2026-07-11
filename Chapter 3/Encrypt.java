// Making a Difference  3.38 (Enforcing Privacy with Cryptography) 
import java.util.Scanner;
 
public class Encrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();
 
        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;
 
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
 
        // swap 1st with 3rd, 2nd with 4th
        int encrypted = (digit3 * 1000) + (digit4 * 100) + (digit1 * 10) + digit2;
 
        System.out.printf("Encrypted number: %04d%n", encrypted);
    }
}

\