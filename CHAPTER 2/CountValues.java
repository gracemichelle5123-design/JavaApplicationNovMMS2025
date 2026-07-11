// 2.32 Negative, Positive, and Zero Count

import java.util.Scanner;

public class CountValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negatives = 0, positives = 0, zeros = 0;

        System.out.print("Enter integer 1: "); int n1 = input.nextInt();
        System.out.print("Enter integer 2: "); int n2 = input.nextInt();
        System.out.print("Enter integer 3: "); int n3 = input.nextInt();
        System.out.print("Enter integer 4: "); int n4 = input.nextInt();
        System.out.print("Enter integer 5: "); int n5 = input.nextInt();

        if (n1 < 0) negatives++; if (n1 > 0) positives++; if (n1 == 0) zeros++;
        if (n2 < 0) negatives++; if (n2 > 0) positives++; if (n2 == 0) zeros++;
        if (n3 < 0) negatives++; if (n3 > 0) positives++; if (n3 == 0) zeros++;
        if (n4 < 0) negatives++; if (n4 > 0) positives++; if (n4 == 0) zeros++;
        if (n5 < 0) negatives++; if (n5 > 0) positives++; if (n5 == 0) zeros++;

        System.out.printf("Negatives: %d%n", negatives);
        System.out.printf("Positives: %d%n", positives);
        System.out.printf("Zeros: %d%n", zeros);
    }
}
