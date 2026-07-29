//3. Write a java method that will calculate the sum of 10 numbers (Use loop).

import java.util.Scanner;

public class SumOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
       
        System.out.println("Enter 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.printf("Total Sum :", sum);
    }
}
