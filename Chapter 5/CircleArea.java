// 5.20 Write an application that prompts the user for the radius of a circle and uses a method circleArea to calculate its area.

import java.util.Scanner;
 
public class CircleArea {
 
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
 
        System.out.printf("Area of the circle: %.2f%n", circleArea(radius));
    }
}
