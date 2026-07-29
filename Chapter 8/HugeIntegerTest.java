public class HugeIntegerTest {
    public static void main(String[] args) {
        HugeInteger h1 = new HugeInteger("99999");
        HugeInteger h2 = new HugeInteger("1");

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h1 + h2 = " + h1.add(h2));
        System.out.println("h1 - h2 = " + h1.subtract(h2));
        System.out.println("h1 > h2? " + h1.isGreaterThan(h2));
        System.out.println("h1 == h2? " + h1.isEqualTo(h2));
        System.out.println("h2 isZero? " + h2.isZero());
    }
}