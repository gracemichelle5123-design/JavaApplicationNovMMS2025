//5.25  (a) Write a method that determines whether a number is prime. (b) Use it to display all primes less than 10,000 — how many numbers do you have to test? (c) Rewrite so the method only tests up to the square root of n, and compare.
.
public class Primes {
 
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; number < 10000; number++) {
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println("Primes below 10000: " + count);
    }
}
