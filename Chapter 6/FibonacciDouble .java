// (b) long overflows right after n=92 -- fibonacci(92) = 7,540,113,804,746,346,429 is the largest Fibonacci number that fits in a 64-bit long; fibonacci(93) would exceed Long.MAX_VALUE and wrap around to a negative number.
// (c) Using double instead of long (same loop, just swap the type):
public class FibonacciDouble {
    public static double fibonacciDouble(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
 
        double previous = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            double next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
 
    public static void main(String[] args) {
        System.out.println("fibonacci(100) = " + fibonacciDouble(100));
        System.out.println("fibonacci(1000) = " + fibonacciDouble(1000));
        System.out.println("fibonacci(1476) = " + fibonacciDouble(1476));
        System.out.println("fibonacci(1477) = " + fibonacciDouble(1477));
    }
}

