// 6.17  Write an application that simulates rolling two six-sided dice 36,000,000 times, using an array to tally the frequency of each possible sum (2-12), then display the results in tabular format.

import java.util.Random;
 
public class DiceRoll {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] frequency = new int[13]; // indices 2-12 used
 
        for (int i = 0; i < 36_000_000; i++) {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            frequency[die1 + die2]++;
        }
 
        System.out.println("Sum   Frequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%3d   %d%n", sum, frequency[sum]);
        }
    }
}

