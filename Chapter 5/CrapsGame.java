// 5.33  Craps Game Modification
import java.util.Scanner;
 
public class CrapsGame {
 
    public static int rollDice() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        int sum = die1 + die2;
        System.out.println("You rolled " + die1 + " and " + die2 + " (total " + sum + ")");
        return sum;
    }
 
    public static String chatter() {
        int choice = (int) (Math.random() * 3);
 
        switch (choice) {
            case 0:
                return "Oh, you're going for broke, huh?";
            case 1:
                return "Aw c'mon, take a chance!";
            default:
                return "You're up big. Now's the time to cash in your chips!";
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
 
        while (bankBalance > 0) {
            System.out.println("\nBank balance: " + bankBalance);
            System.out.println(chatter());
 
            System.out.print("Enter your wager: ");
            int wager = input.nextInt();
 
            while (wager > bankBalance || wager <= 0) {
                System.out.print("Invalid wager. Enter an amount up to " + bankBalance + ": ");
                wager = input.nextInt();
            }
 
            boolean won;
            int sum = rollDice();
 
            if (sum == 7 || sum == 11) {
                System.out.println("You win on the first roll!");
                won = true;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose on the first roll.");
                won = false;
            } else {
                int point = sum;
                System.out.println("Your point is " + point);
                boolean decided = false;
                boolean wonGame = false;
 
                while (!decided) {
                    sum = rollDice();
                    if (sum == point) {
                        System.out.println("You made your point! You win!");
                        decided = true;
                        wonGame = true;
                    } else if (sum == 7) {
                        System.out.println("Seven out. You lose.");
                        decided = true;
                        wonGame = false;
                    }
                }
                won = wonGame;
            }
 
            if (won) {
                bankBalance += wager;
                System.out.println("New bank balance: " + bankBalance);
            } else {
                bankBalance -= wager;
                System.out.println("New bank balance: " + bankBalance);
 
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                }
            }
 
            if (bankBalance > 0) {
                System.out.print("Play again? (y/n): ");
                char again = input.next().charAt(0);
                if (again != 'y' && again != 'Y') {
                    break;
                }
            }
        }
 
        System.out.println("\nFinal bank balance: " + bankBalance);
    }
}
