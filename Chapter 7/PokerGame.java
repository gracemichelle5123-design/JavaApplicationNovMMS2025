// 4  Card Shuffling and Dealing: Playing Against the Dealer
import java.util.Scanner;
 
public class PokerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerWins = 0, dealerWins = 0, ties = 0;
 
        for (int game = 1; game <= 20; game++) {
            System.out.println("\n=== Game " + game + " ===");
            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();
 
            Card[] playerHand = deck.dealHand();
            Card[] dealerHand = deck.dealHand(); // face down
 
            System.out.println("Your hand: " + java.util.Arrays.toString(playerHand)
                + " -> " + PokerEval.rankName(playerHand));
 
            System.out.print("Enter up to 3 card positions to replace (1-5, 0 to stop): ");
            boolean[] replace = new boolean[5];
            for (int i = 0; i < 3; i++) {
                int pos = input.nextInt();
                if (pos == 0) break;
                replace[pos - 1] = true;
            }
            for (int pos = 0; pos < 5; pos++) {
                if (replace[pos]) {
                    playerHand[pos] = deck.dealCard();
                }
            }
 
            int dealerDraw = DealerSimulation.drawCount(dealerHand);
            DealerSimulation.redraw(dealerHand, deck, dealerDraw);
 
            System.out.println("Your final hand: " + java.util.Arrays.toString(playerHand)
                + " -> " + PokerEval.rankName(playerHand));
            System.out.println("Dealer's hand: " + java.util.Arrays.toString(dealerHand)
                + " -> " + PokerEval.rankName(dealerHand));
 
            int playerRank = PokerEval.rank(playerHand), dealerRank = PokerEval.rank(dealerHand);
            if (playerRank > dealerRank) { System.out.println("You win!"); playerWins++; }
            else if (dealerRank > playerRank) { System.out.println("Dealer wins."); dealerWins++; }
            else { System.out.println("Tie."); ties++; }
        }
 
        System.out.println("\nFinal score after 20 games -- You: " + playerWins
            + "  Dealer: " + dealerWins + "  Ties: " + ties);
    }
}

