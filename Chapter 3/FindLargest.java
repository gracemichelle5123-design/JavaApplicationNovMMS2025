// 3.21  Find the Largest Number
import java.util.Scanner;
 
public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int counter;
        int number;
        int largest;
 
        System.out.print("Enter integer 1: ");
        largest = input.nextInt();
 
        for (counter = 2; counter <= 10; counter++) {
            System.out.print("Enter integer " + counter + ": ");
            number = input.nextInt();
 
            if (number > largest) {
                largest = number;
            }
        }
 
        System.out.println("Largest number found: " + largest);
    }
}
