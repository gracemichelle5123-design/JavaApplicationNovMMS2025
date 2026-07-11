// 5.17  Write a method isEven that uses the remainder operator to determine whether an integer is even. Incorporate it into an application that inputs a sequence of integers.
import java.util.Scanner;
 
public class EvenOrOdd {
 
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter an integer (or 0 to quit): ");
        int number = input.nextInt();
 
        while (number != 0) {
            if (isEven(number)) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
 
            System.out.print("Enter an integer (or 0 to quit): ");
            number = input.nextInt();
        }
    }
}
