// 5.14  Write a method integerPower(base, exponent) that returns base raised to exponent, using a loop and no Math class methods. Incorporate it into an application that reads base and exponent.
import java.util.Scanner;
 
public class IntegerPower {
 
    public static long integerPower(int base, int exponent) {
        long result = 1;
 
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
 
        return result;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter base: ");
        int base = input.nextInt();
 
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
 
        System.out.println(base + " raised to the " + exponent + " power is " + integerPower(base, exponent));
    }
}
