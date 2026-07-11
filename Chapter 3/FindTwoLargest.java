// 3.23  Find the Two Largest Numbers
import java.util.Scanner;
 
public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int largest;
        int secondLargest;
 
        System.out.print("Enter integer 1: ");
        int first = input.nextInt();
        System.out.print("Enter integer 2: ");
        int second = input.nextInt();
 
        if (first > second) {
            largest = first;
            secondLargest = second;
        } else {
            largest = second;
            secondLargest = first;
        }
 
        for (int counter = 3; counter <= 10; counter++) {
            System.out.print("Enter integer " + counter + ": ");
            int number = input.nextInt();
 
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
 
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}
