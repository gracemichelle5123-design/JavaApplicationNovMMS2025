//1. Write a java method to find the smallest among three numbers .
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
       
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
       
        System.out.printf("Smallest :%d",smallest);
      
    }
}
