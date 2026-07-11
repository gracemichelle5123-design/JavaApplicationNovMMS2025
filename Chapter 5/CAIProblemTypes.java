// 5.39  CAI: Varying the Types of Problems

For division, the divisor and the (whole-number) answer are picked first, and the dividend is built from their product — that way the division always comes out even, which is what an elementary-level question needs. For subtraction, the two operands are ordered so the result is never negative.
import java.security.SecureRandom;
import java.util.Scanner;
 
public class CAIProblemTypes {
    static SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    static int num1, num2, correctAnswer;
    static int difficultyLevel;
    static int problemType;
    static char operationSymbol;
 
    public static void generateQuestion() {
        int maxValue = (int) Math.pow(10, difficultyLevel) - 1;
        int type = problemType;
 
        if (type == 5) {
            type = randomNumbers.nextInt(4) + 1;
        }
 
        if (type == 1) {                       // addition
            num1 = randomNumbers.nextInt(maxValue) + 1;
            num2 = randomNumbers.nextInt(maxValue) + 1;
            correctAnswer = num1 + num2;
            operationSymbol = '+';
        } else if (type == 2) {                // subtraction, no negative results
            int a = randomNumbers.nextInt(maxValue) + 1;
            int b = randomNumbers.nextInt(maxValue) + 1;
            num1 = Math.max(a, b);
            num2 = Math.min(a, b);
            correctAnswer = num1 - num2;
            operationSymbol = '-';
        } else if (type == 3) {                // multiplication
            num1 = randomNumbers.nextInt(maxValue) + 1;
            num2 = randomNumbers.nextInt(maxValue) + 1;
            correctAnswer = num1 * num2;
            operationSymbol = '*';
        } else {                               // division, always exact
            num2 = randomNumbers.nextInt(maxValue) + 1;
            correctAnswer = randomNumbers.nextInt(maxValue) + 1;
            num1 = num2 * correctAnswer;
            operationSymbol = '/';
        }
 
        System.out.println("How much is " + num1 + " " + operationSymbol + " " + num2 + "?");
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
        System.out.print("Enter difficulty level (1, 2, 3, ...): ");
        difficultyLevel = input.nextInt();
 
        System.out.println("Choose problem type:");
        System.out.println("1. Addition  2. Subtraction  3. Multiplication  4. Division  5. Mixture");
        problemType = input.nextInt();
 
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
