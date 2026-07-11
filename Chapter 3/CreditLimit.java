// 3.18  Credit Limit Calculator
import java.util.Scanner;
 
public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter account number (-1 to end): ");
        int accountNumber = input.nextInt();
 
        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();
 
            System.out.print("Enter total charges: ");
            int charges = input.nextInt();
 
            System.out.print("Enter total credits: ");
            int credits = input.nextInt();
 
            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();
 
            int newBalance = beginningBalance + charges - credits;
 
            System.out.println("New balance for account " + accountNumber + ": " + newBalance);
 
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
 
            System.out.print("\nEnter account number (-1 to end): ");
            accountNumber = input.nextInt();
        }
        System.out.println("No more accounts to process.");
    }
}
