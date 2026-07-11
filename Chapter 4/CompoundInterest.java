// 4.14 Modify the compound-interest application to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
 
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.printf("Interest rate: %.0f%%%n", rate * 100);
            System.out.println("Year\tAmount on deposit");
 
            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%d\t%.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}

