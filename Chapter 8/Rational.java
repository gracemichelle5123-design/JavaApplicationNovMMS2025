// 8.15

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() { this(0, 1); }

    public Rational(int num, int den) {
        int gcd = gcd(num, den);
        numerator = num / gcd;
        denominator = den / gcd;
    }

    private int gcd(int a, int b) { return b == 0? a : gcd(b, a % b); }

    public static Rational add(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.denominator + r2.numerator * r1.denominator,
                            r1.denominator * r2.denominator);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.denominator - r2.numerator * r1.denominator,
                            r1.denominator * r2.denominator);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        return new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
    }

    public String toString() { return numerator + "/" + denominator; }
    public String toFloatString() { return String.format("%.4f", (double)numerator/denominator); }
}