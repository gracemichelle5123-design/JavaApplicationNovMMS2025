// 5.10 Write an application that defines four methods for rounding a number x: roundToInteger, roundToTenths, roundToHundredths, and roundToThousandths. Display the original value and all four rounded versions.:
import java.util.Scanner;
 
public class Rounding {
 
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
 
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
 
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
 
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a number (-1 to quit): ");
        double number = input.nextDouble();
 
        while (number != -1) {
            System.out.println("Original: " + number);
            System.out.println("Nearest integer: " + roundToInteger(number));
            System.out.println("Nearest tenth: " + roundToTenths(number));
            System.out.println("Nearest hundredth: " + roundToHundredths(number));
            System.out.println("Nearest thousandth: " + roundToThousandths(number));
            System.out.println();
 
            System.out.print("Enter a number (-1 to quit): ");
            number = input.nextDouble();
        }
    }
}
