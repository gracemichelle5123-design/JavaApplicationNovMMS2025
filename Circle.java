// 8.9  Static Imports
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
 
public class Circle {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * pow(radius, 2);          // no "Math." prefix needed
        double diagonal = sqrt(pow(radius, 2) * 2);
        System.out.println("Area: " + area);
        System.out.println("Diagonal-ish value: " + diagonal);
    }
}
