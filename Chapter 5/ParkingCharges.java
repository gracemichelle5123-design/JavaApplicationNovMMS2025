// 5.8  A parking garage charges $2.00 minimum for up to 3 hours, plus $0.50 per hour (or part thereof) beyond 3 hours, capped at $10.00 for 24 hours. Write an application that calculates and displays parking charges for each customer, using method calculateCharges, and tracks a running total of receipts.
Math.ceil rounds any partial hour beyond 3 up to a full extra hour, exactly as the garage's pricing rule requires.
import java.util.Scanner;
 
public class ParkingCharges {
 
    public static double calculateCharges(double hours) {
        double charge;
 
        if (hours <= 3.0) {
            charge = 2.00;
        } else {
            charge = 2.00 + (Math.ceil(hours - 3.0) * 0.50);
        }
 
        if (charge > 10.00) {
            charge = 10.00;
        }
 
        return charge;
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
 
        System.out.print("Enter hours parked (-1 to end): ");
        double hours = input.nextDouble();
 
        while (hours != -1) {
            double charge = calculateCharges(hours);
            totalReceipts += charge;
 
            System.out.printf("Charge: $%.2f%n", charge);
            System.out.printf("Running total of receipts: $%.2f%n%n", totalReceipts);
 
            System.out.print("Enter hours parked (-1 to end): ");
            hours = input.nextDouble();
        }
    }
}
