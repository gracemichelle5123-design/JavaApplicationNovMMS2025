// 5.29  Coin Tossing

import java.util.Scanner;
 
public class CoinToss {
 
    enum Coin { HEADS, TAILS }
 
    public static Coin flip() {
        int result = (int) (Math.random() * 2);
 
        if (result == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
 
        System.out.println("1. Toss Coin");
        System.out.println("2. Quit");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
 
        while (choice != 2) {
            Coin result = flip();
            System.out.println("Result: " + result);
 
            if (result == Coin.HEADS) {
                headsCount++;
            } else {
                tailsCount++;
            }
            System.out.println("1. Toss Coin");
            System.out.println("2. Quit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
        }
 
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}

