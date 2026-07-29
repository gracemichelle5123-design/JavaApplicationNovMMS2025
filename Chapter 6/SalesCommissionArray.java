// 6.10 (Sales Commissions) 
import java.util.Scanner;
 
public class SalesCommissionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] rangeCounts = new int[9]; 
 
        System.out.print("How many salespeople? ");
        int n = input.nextInt();
 
        for (int i = 0; i < n; i++) {
            System.out.print("Gross sales for salesperson " + (i + 1) + ": $");
            double grossSales = input.nextDouble();
            int salary = (int) (200 + 0.09 * grossSales);
 
            int index = (salary >= 1000) ? 8 : (salary - 200) / 100;
            rangeCounts[index]++;
        }
 
        System.out.println("\nSalary Range      Count");
        for (int i = 0; i < 8; i++) {
            System.out.printf("$%d-%d        %d%n", 200 + i * 100, 299 + i * 100, rangeCounts[i]);
        }
        System.out.println("$1000 and over   " + rangeCounts[8]);
    }
}

