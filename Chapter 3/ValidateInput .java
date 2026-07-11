// 3.24  Validating User Input
import java.util.Scanner;
 
public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
 
        for (int student = 1; student <= 10; student++) {
            System.out.print("Enter result for student " + student + " (1 = pass, 2 = fail): ");
            int result = input.nextInt();
 
            while (result != 1 && result != 2) {
                System.out.print("Invalid input. Please enter 1 or 2: ");
                result = input.nextInt();
            }
 
            if (result == 1) {
                passes++;
            } else {
                failures++;
            }
        }
 
        System.out.println("Passed: " + passes);
        System.out.println("Failed: " + failures);
    }
}
