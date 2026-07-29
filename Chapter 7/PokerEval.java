// 2  Card Shuffling and Dealing: Comparing Two Hands
public class PokerEval {
    private static final String[] RANK_NAMES = {
        "High Card", "Pair", "Two Pair", "Three of a Kind",
        "Straight", "Flush", "Full House", "Four of a Kind"
    };
 
    public static int rank(Card[] hand) {
        if (DeckOfCards.hasFourOfAKind(hand)) return 7;
        if (DeckOfCards.hasFullHouse(hand)) return 6;
        if (DeckOfCards.hasFlush(hand)) return 5;
        if (DeckOfCards.hasStraight(hand)) return 4;
        if (DeckOfCards.hasThreeOfAKind(hand)) return 3;
        if (DeckOfCards.hasTwoPairs(hand)) return 2;
        if (DeckOfCards.hasPair(hand)) return 1;
        return 0;
    }
 
    public static String rankName(Card[] hand) {
        return RANK_NAMES[rank(hand)];
    }
 
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
 
        Card[] hand1 = deck.dealHand();
        Card[] hand2 = deck.dealHand();
 
        System.out.println("Hand 1: " + java.util.Arrays.toString(hand1) + " -> " + rankName(hand1));
        System.out.println("Hand 2: " + java.util.Arrays.toString(hand2) + " -> " + rankName(hand2));
 
        int r1 = rank(hand1), r2 = rank(hand2);
        if (r1 > r2) System.out.println("Hand 1 wins!");
        else if (r2 > r1) System.out.println("Hand 2 wins!");
        else System.out.println("Same category -- treat as a tie.");
    }
}
