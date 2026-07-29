// 6.33  Polling
import java.util.Scanner;
 
public class Polling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] topics = {
            "Clean water access", "Environmental conservation",
            "Quality education access", "Reducing poverty", "Youth unemployment"
        };
        int[][] responses = new int[5][10]; // row = topic, column = rating (1-10) minus 1
 
        System.out.print("How many people will respond? ");
        int respondents = input.nextInt();
 
        for (int person = 1; person <= respondents; person++) {
            System.out.println("\nRespondent " + person + ":");
            for (int t = 0; t < 5; t++) {
                System.out.print("  Rate \"" + topics[t] + "\" (1-10): ");
                int rating = input.nextInt();
                responses[t][rating - 1]++;
            }
        }
 
        System.out.print("\nTopic                          ");
        for (int r = 1; r <= 10; r++) System.out.printf("%3d", r);
        System.out.println("   Average");
 
        int bestTotalPoints = -1, bestTopic = -1;
 
        for (int t = 0; t < 5; t++) {
            System.out.printf("%-30s", topics[t]);
            int totalPoints = 0, totalResponses = 0;
            for (int r = 0; r < 10; r++) {
                System.out.printf("%3d", responses[t][r]);
                totalPoints += responses[t][r] * (r + 1);
                totalResponses += responses[t][r];
            }
            double average = (totalResponses == 0) ? 0 : (double) totalPoints / totalResponses;
            System.out.printf("   %.2f%n", average);
 
            if (totalPoints > bestTotalPoints) {
                bestTotalPoints = totalPoints;
                bestTopic = t;
            }
        }
 
        System.out.println("\nHighest-rated issue: \"" + topics[bestTopic] + "\" with "
            + bestTotalPoints + " total points.");
    }
}

