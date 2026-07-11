// 2.24 Largest and Smallest of Five Integers

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: "); int n1 = input.nextInt();
        System.out.print("Enter integer 2: "); int n2 = input.nextInt();
        System.out.print("Enter integer 3: "); int n3 = input.nextInt();
        System.out.print("Enter integer 4: "); int n4 = input.nextInt();
        System.out.print("Enter integer 5: "); int n5 = input.nextInt();

        int largest = n1;
        int smallest = n1;

        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        if (n4 > largest) largest = n4;
        if (n5 > largest) largest = n5;

        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
        if (n4 < smallest) smallest = n4;
        if (n5 < smallest) smallest = n5;

        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);
    }
}
