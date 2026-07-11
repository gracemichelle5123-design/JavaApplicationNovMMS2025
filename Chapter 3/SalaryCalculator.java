// 3.20  Salary Calculator
import java.util.Scanner;
 
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        for (int employee = 1; employee <= 3; employee++) {
            System.out.println("Employee " + employee);
 
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();
 
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();
 
            double grossPay;
 
            if (hours > 40) {
                double overtimeHours = hours - 40;
                grossPay = (40 * rate) + (overtimeHours * rate * 1.5);
            } else {
                grossPay = hours * rate;
            }
 
            System.out.printf("Gross pay: $%.2f%n%n", grossPay);
        }
    }
}
