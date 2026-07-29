// 8.11  Create class Complex for complex-number arithmetic (add, subtract, print as (real, imaginary)). Include a no-argument constructor with defaults.

public class Complex {
    private double real;
    private double imaginary;
 
    public Complex() { this(0.0, 0.0); }
 
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
 
    public Complex add(Complex other) {
        return new Complex(real + other.real, imaginary + other.imaginary);
    }
 
    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imaginary - other.imaginary);
    }
 
    public String toString() {
        return "(" + real + ", " + imaginary + ")";
    }
}
