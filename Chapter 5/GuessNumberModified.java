// 5.31
import java.util.Scanner;
 
public class GuessNumberModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playAgain = 'y';
 
        while (playAgain == 'y' || playAgain == 'Y') {
            int numberToGuess = (int) (Math.random() * 1000) + 1;
            int guessCount = 0;
 
            System.out.println("Guess a number between 1 and 1000.");
            int guess = input.nextInt();
            guessCount++;
 
            while (guess != numberToGuess) {
                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
                guess = input.nextInt();
                guessCount++;
            }
 
            System.out.println("Congratulations. You guessed the number!");
            System.out.println("Number of guesses: " + guessCount);
 
            if (guessCount < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (guessCount == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println("You should be able to do better!");
            }
 
            System.out.print("Play again? (y/n): ");
            playAgain = input.next().charAt(0);
        }
    }
}

