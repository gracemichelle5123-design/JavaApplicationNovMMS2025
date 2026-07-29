// 6.19  
import java.util.Scanner;
 
public class TotalSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4]; // rows = products, columns = salespeople
 
        for (int product = 0; product < 5; product++) {
            for (int person = 0; person < 4; person++) {
                System.out.printf("Product %d, salesperson %d: $", product + 1, person + 1);
                sales[product][person] = input.nextDouble();
            }
        }
 
        double[] personTotals = new double[4];
        System.out.println("\n           Sales1     Sales2     Sales3     Sales4     Total");
        for (int product = 0; product < 5; product++) {
            System.out.printf("Product %d  ", product + 1);
            double rowTotal = 0;
            for (int person = 0; person < 4; person++) {
                System.out.printf("%-11.2f", sales[product][person]);
                rowTotal += sales[product][person];
                personTotals[person] += sales[product][person];
            }
            System.out.printf("%.2f%n", rowTotal);
        }
 
        System.out.print("Total      ");
        double grandTotal = 0;
        for (int person = 0; person < 4; person++) {
            System.out.printf("%-11.2f", personTotals[person]);
            grandTotal += personTotals[person];
        }
        System.out.printf("%.2f%n", grandTotal);
    }
}

