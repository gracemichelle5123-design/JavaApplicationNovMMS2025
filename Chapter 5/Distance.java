//  5.32  Write method distance to calculate the distance between two points (x1, y1) and (x2, y2), using type double throughout. Incorporate it into an application that lets the user enter the coordinates.
import java.util.Scanner;
 
public class Distance {
 
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
 
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
 
        System.out.printf("Distance: %.2f%n", distance(x1, y1, x2, y2));
    }
}
