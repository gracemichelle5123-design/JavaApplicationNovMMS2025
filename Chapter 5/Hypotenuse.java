// 5.15  Define a method hypotenuse that calculates the hypotenuse of a right triangle given the other two sides (as doubles), using Math.pow and Math.sqrt. Apply it to the triangles in Fig. 5.14: (3.0, 4.0), (5.0, 12.0), (8.0, 15.0).
public class Hypotenuse {
 
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
 
    public static void main(String[] args) {
        System.out.println("Triangle 1: " + hypotenuse(3.0, 4.0));
        System.out.println("Triangle 2: " + hypotenuse(5.0, 12.0));
        System.out.println("Triangle 3: " + hypotenuse(8.0, 15.0));
    }
}

