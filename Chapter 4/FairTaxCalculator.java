// 4.31  
import java.util.Scanner;
 
public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalExpenses = 0.0;
 
        String[] categories = {
            "Housing", "Food", "Clothing", "Transportation",
            "Education", "Health care", "Vacations"
        };
 
        System.out.print("Enter housing expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter food expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter clothing expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter transportation expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter education expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter health care expenses: ");
        totalExpenses += input.nextDouble();
        System.out.print("Enter vacation expenses: ");
        totalExpenses += input.nextDouble();
 
        double fairTax = totalExpenses * 0.23;
 
        System.out.printf("%nTotal spending entered: $%.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%% tax-inclusive rate): $%.2f%n", fairTax);
    }
}

