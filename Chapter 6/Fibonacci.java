// 6.29  Fibonacci Series
public class Fibonacci {
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
 
        long previous = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
 
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("fibonacci(92) = " + fibonacci(92));
    }
}

