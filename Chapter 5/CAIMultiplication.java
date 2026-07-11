// Making a Difference
// 5.35  

import java.security.SecureRandom;
import java.util.Scanner;
 
public class CAIMultiplication {
    static SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    static int num1, num2, correctAnswer;
 
    public static void generateQuestion() {
        num1 = randomNumbers.nextInt(9) + 1;
        num2 = randomNumbers.nextInt(9) + 1;
        correctAnswer = num1 * num2;
 
        System.out.println("How much is " + num1 + " times " + num2 + "?");
    }
 
    public static void main(String[] args) {
        int questionsAsked = 0;
 
        generateQuestion();
 
        while (questionsAsked < 10) {
            int answer = input.nextInt();
 
            if (answer == correctAnswer) {
                System.out.println("Very good!");
                questionsAsked++;
                if (questionsAsked < 10) {
                    generateQuestion();
                }
            } else {
                System.out.println("No. Please try again.");
            }
        }
 
        System.out.println("That's all for now. Great job!");
    }
}

