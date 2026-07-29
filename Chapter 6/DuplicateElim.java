// 6.12  Input 5 numbers between 10 and 100. As each is read, print it only if it's not a duplicate of a number already read; skip duplicates. Use the smallest array that accomplishes this.

import java.util.Scanner;
 
public class DuplicateElim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];
        int uniqueCount = 0;
 
        while (uniqueCount < 5) {
            System.out.print("Enter number " + (uniqueCount + 1) + " (10-100): ");
            int number = input.nextInt();
 
            boolean duplicate = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueNumbers[i] == number) {
                    duplicate = true;
                    break;
                }
            }
 
            if (!duplicate) {
                uniqueNumbers[uniqueCount] = number;
                uniqueCount++;
                System.out.println(number + " stored.");
            } else {
                System.out.println(number + " is a duplicate -- not stored.");
            }
        }
    }
}
