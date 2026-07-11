// 5.24  Write a method isPerfect and use it to display all perfect numbers between 1 and 1000, along with their factors.

public class PerfectNumbers {
 
    public static boolean isPerfect(int number) {
        int sum = 0;
 
        for (int factor = 1; factor < number; factor++) {
            if (number % factor == 0) {
                sum += factor;
            }
        }
 
        return (sum == number);
    }
 
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.print("Perfect number: " + number + "  (factors: ");
 
                for (int factor = 1; factor < number; factor++) {
                    if (number % factor == 0) {
                        System.out.print(factor + " ");
                    }
                }
                System.out.println(")");
            }
        }
    }
}
