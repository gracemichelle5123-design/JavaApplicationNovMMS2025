// 2.28 Diameter, Circumference and Area of a Circle

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius (integer): ");
        int radius = input.nextInt();

        System.out.printf("Diameter is %d%n", 2 * radius);
        System.out.printf("Circumference is %f%n", 2 * 3.14159 * radius);
        System.out.printf("Area is %f%n", 3.14159 * radius * radius);
    }
}
