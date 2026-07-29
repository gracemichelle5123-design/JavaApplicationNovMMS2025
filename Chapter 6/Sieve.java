// 6.27  Sieve of Eratosthenes
public class Sieve {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1000];
        for (int i = 2; i < 1000; i++) {
            isPrime[i] = true;
        }
 
        for (int i = 2; i < 1000; i++) {
            if (isPrime[i]) {
                for (int multiple = 2 * i; multiple < 1000; multiple += i) {
                    isPrime[multiple] = false;
                }
            }
        }
 
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal primes: " + count);
    }
}
