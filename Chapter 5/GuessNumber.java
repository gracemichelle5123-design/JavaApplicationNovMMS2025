// 5.30  Write an application that plays "guess the number." The program picks a random integer from 1 to 1000, prompts the player to guess, and responds "Too high" or "Too low" until the player gets it. Then let the player choose to play again.

import java.util.Scanner;
 
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playAgain = 'y';
 
        while (playAgain == 'y' || playAgain == 'Y') {
            int numberToGuess = (int) (Math.random() * 1000) + 1;
 
            System.out.println("Guess a number between 1 and 1000.");
            int guess = input.nextInt();
 
            while (guess != numberToGuess) {
                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
                guess = input.nextInt();
            }
 
            System.out.println("Congratulations. You guessed the number!");
 
            System.out.print("Play again? (y/n): ");
            playAgain = input.next().charAt(0);
        }
    }
}
