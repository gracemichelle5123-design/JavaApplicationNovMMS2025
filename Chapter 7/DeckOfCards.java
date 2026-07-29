import java.security.SecureRandom;
import java.util.Arrays; 

public class DeckOfCards {
    private Card[] deck = new Card[52];
    private int currentCard = 0;
    private SecureRandom rng = new SecureRandom();

    public DeckOfCards() {
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[index++] = new Card(face, suit);
            }
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rng.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {
        return (currentCard < deck.length)? deck[currentCard++] : null;
    }

    public Card[] dealHand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = dealCard();
        }
        return hand;
    }

    // ---- hand-evaluation methods ----

    private static int[] faceCounts(Card[] hand) {
        int[] counts = new int[14];
        for (Card c : hand) counts[c.getFace()]++;
        return counts;
    }

    public static boolean hasPair(Card[] hand) {
        int pairs = 0;
        for (int c : faceCounts(hand)) if (c == 2) pairs++;
        return pairs == 1 &&!hasThreeOfAKind(hand) &&!hasFourOfAKind(hand) &&!hasFullHouse(hand);
    }

    public static boolean hasTwoPairs(Card[] hand) {
        int pairs = 0;
        for (int c : faceCounts(hand)) if (c == 2) pairs++;
        return pairs == 2;
    }

    public static boolean hasThreeOfAKind(Card[] hand) {
        boolean three = false, two = false;
        for (int c : faceCounts(hand)) { if (c == 3) three = true; if (c == 2) two = true; }
        return three &&!two;
    }

    public static boolean hasFourOfAKind(Card[] hand) {
        for (int c : faceCounts(hand)) if (c == 4) return true;
        return false;
    }

    public static boolean hasFullHouse(Card[] hand) {
        boolean three = false, two = false;
        for (int c : faceCounts(hand)) { if (c == 3) three = true; if (c == 2) two = true; }
        return three && two;
    }

    public static boolean hasFlush(Card[] hand) {
        int suit = hand[0].getSuit();
        for (Card c : hand) if (c.getSuit()!= suit) return false;
        return true;
    }

    public static boolean hasStraight(Card[] hand) {
        int[] faces = new int[5];
        for (int i = 0; i < 5; i++) faces[i] = hand[i].getFace();
        Arrays.sort(faces); // now works because of import

        boolean consecutive = true;
        for (int i = 1; i < 5; i++) {
            if (faces[i]!= faces[i - 1] + 1) { consecutive = false; break; }
        }
        if (consecutive) return true;

        // Ace-high straight: 10, J, Q, K, A
        return faces[0] == 1 && faces[1] == 10 && faces[2] == 11 && faces[3] == 12 && faces[4] == 13;
    }

    // ---- ADDED MAIN TO TEST ----
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Card[] hand = deck.dealHand();

        System.out.println("Dealt 5-Card Hand:");
        for (Card c : hand) {
            System.out.println(c);
        }

        System.out.println("\nHand Evaluation:");
        if (hasPair(hand)) System.out.println("Pair");
        if (hasTwoPairs(hand)) System.out.println("Two Pairs");
        if (hasThreeOfAKind(hand)) System.out.println("Three of a Kind");
        if (hasFourOfAKind(hand)) System.out.println("Four of a Kind");
        if (hasFlush(hand)) System.out.println("Flush");
        if (hasStraight(hand)) System.out.println("Straight");
        if (hasFullHouse(hand)) System.out.println("Full House");
        if (!hasPair(hand) &&!hasTwoPairs(hand) &&!hasThreeOfAKind(hand) &&
           !hasFourOfAKind(hand) &&!hasFlush(hand) &&!hasStraight(hand) &&!hasFullHouse(hand))
            System.out.println("High Card");
    }
}