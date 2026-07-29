public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    // no-arg constructor defaults to 1
    public Rectangle() {}

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}