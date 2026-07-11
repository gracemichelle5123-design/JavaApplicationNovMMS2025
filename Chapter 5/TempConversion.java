// 5.22  Implement methods celsius (from Fahrenheit) and fahrenheit (from Celsius). Use both in an application that lets the user convert in either direction.
import java.util.Scanner;
 
public class TempConversion {
 
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
 
    public static double fahrenheit(double celsiusTemp) {
        return 9.0 / 5.0 * celsiusTemp + 32;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");
        int choice = input.nextInt();
 
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double f = input.nextDouble();
            System.out.printf("Celsius equivalent: %.1f%n", celsius(f));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double c = input.nextDouble();
            System.out.printf("Fahrenheit equivalent: %.1f%n", fahrenheit(c));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

