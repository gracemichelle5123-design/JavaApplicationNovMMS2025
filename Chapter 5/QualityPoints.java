// 5.28  Write a method qualityPoints that inputs a student's average and returns 4 if it's 90-100, 3 if 80-89, 2 if 70-79, 1 if 60-69, and 0 if lower than 60.

import java.util.Scanner;
 
public class QualityPoints {
 
    public static int qualityPoints(int average) {
        if (average >= 90) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter student's average: ");
        int average = input.nextInt();
 
        System.out.println("Quality points: " + qualityPoints(average));
    }
}

