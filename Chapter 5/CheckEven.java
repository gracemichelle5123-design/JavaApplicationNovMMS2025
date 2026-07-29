//4.Write a java method to accept five numbers from a user and check whether they are even .

import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
           
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.printf(num +" is Odd");
            }
        }
    }
}