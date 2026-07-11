// 5.38  

// The operand's upper bound is just 10^difficultyLevel - 1, so level 1 gives 1-9, level 2 gives 1-99, level 3 gives 1-999, and so on.

import java.security.SecureRandom;
import java.util.Scanner;
 
public class CAIDifficultyLevels {
    static SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    static int num1, num2, correctAnswer;
    static int difficultyLevel;
 
    public static void generateQuestion() {
        int maxValue = (int) Math.pow(10, difficultyLevel) - 1;
        num1 = randomNumbers.nextInt(maxValue) + 1;
        num2 = randomNumbers.nextInt(maxValue) + 1;
        correctAnswer = num1 * num2;
        System.out.println("How much is " + num1 + " times " + num2 + "?");
    }
 
    public static void displayCorrectResponse() {
        switch (randomNumbers.nextInt(4) + 1) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }
 
    public static void displayIncorrectResponse() {
        switch (randomNumbers.nextInt(4) + 1) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }
 
    public static void main(String[] args) {
        System.out.print("Enter difficulty level (1 = single digits, 2 = up to two digits, ...): ");
        difficultyLevel = input.nextInt();
 
        int questionsAsked = 0;
        generateQuestion();
 
        while (questionsAsked < 10) {
            int answer = input.nextInt();
 
            if (answer == correctAnswer) {
                displayCorrectResponse();
                questionsAsked++;
                if (questionsAsked < 10) {
                    generateQuestion();
                }
            } else {
                displayIncorrectResponse();
            }
        }
 
        System.out.println("That's all for now. Great job!");
    }
}

