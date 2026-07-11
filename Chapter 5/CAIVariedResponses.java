
// 5.36  


import java.security.SecureRandom;
import java.util.Scanner;
 
public class CAIVariedResponses {
    static SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    static int num1, num2, correctAnswer;
 
    public static void generateQuestion() {
        num1 = randomNumbers.nextInt(9) + 1;
        num2 = randomNumbers.nextInt(9) + 1;
        correctAnswer = num1 * num2;
 
        System.out.println("How much is " + num1 + " times " + num2 + "?");
    }
 
    public static void displayCorrectResponse() {
        switch (randomNumbers.nextInt(4) + 1) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }
 
    public static void displayIncorrectResponse() {
        switch (randomNumbers.nextInt(4) + 1) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up! No.");
                break;
            case 4:
                System.out.println("Keep trying.");
                break;
        }
    }
 
    public static void main(String[] args) {
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

