// 3.19  Sales Commission Calculator
import java.util.Scanner;
 
public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double itemPrice1 = 239.99;
        double itemPrice2 = 129.75;
        double itemPrice3 = 99.95;
        double itemPrice4 = 350.89;
 
        System.out.print("Enter number of item 1 sold: ");
        int item1Count = input.nextInt();
        System.out.print("Enter number of item 2 sold: ");
        int item2Count = input.nextInt();
        System.out.print("Enter number of item 3 sold: ");
        int item3Count = input.nextInt();
        System.out.print("Enter number of item 4 sold: ");
        int item4Count = input.nextInt();
 
        double grossSales = (item1Count * itemPrice1) + (item2Count * itemPrice2)
                + (item3Count * itemPrice3) + (item4Count * itemPrice4);
 
        double earnings = 200 + (0.09 * grossSales);
 
        System.out.printf("Gross sales: $%.2f%n", grossSales);
        System.out.printf("Earnings for the week: $%.2f%n", earnings);
    }
}

