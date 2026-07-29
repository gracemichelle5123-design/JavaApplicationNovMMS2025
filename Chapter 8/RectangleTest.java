public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
       
        System.out.println("Initial length: " + rectangle.getLength());
        System.out.println("Initial width: " + rectangle.getWidth());
       
        rectangle.setLength(5.0);
        rectangle.setWidth(3.0);
       
        System.out.println("New length: " + rectangle.getLength());
        System.out.println("New width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
       
        // test invalid input
        rectangle.setLength(25.0);
        System.out.println("After invalid length: " + rectangle.getLength());
    }
}