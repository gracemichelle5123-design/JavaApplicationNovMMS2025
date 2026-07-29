// 3  Card Shuffling and Dealing: Simulating the Dealer
public class DealerSimulation {
    public static int drawCount(Card[] hand) {
        if (DeckOfCards.hasFourOfAKind(hand) || DeckOfCards.hasFullHouse(hand)
                || DeckOfCards.hasFlush(hand) || DeckOfCards.hasStraight(hand)) {
            return 0;
        }
        if (hasThreeOfAKindRaw(hand)) return 2;
        if (DeckOfCards.hasTwoPairs(hand)) return 1;
        return 3; // one pair, or nothing
    }
 
    private static boolean hasThreeOfAKindRaw(Card[] hand) {
        int[] counts = new int[14];
        for (Card c : hand) counts[c.getFace()]++;
        for (int c : counts) if (c == 3) return true;
        return false;
    }
 
    // Ranks the 5 card positions so the ones worth keeping (part of a pair/set,
    // then higher face value) come first -- a plain selection sort, no shortcuts.
    // Then replaces the last drawCount positions in that order.
    public static void redraw(Card[] hand, DeckOfCards deck, int drawCount) {
        int[] counts = new int[14];
        for (Card c : hand) counts[c.getFace()]++;
 
        int[] order = { 0, 1, 2, 3, 4 };
        for (int i = 0; i < order.length - 1; i++) {
            int bestIndex = i;
            for (int j = i + 1; j < order.length; j++) {
                int countJ = counts[hand[order[j]].getFace()];
                int countBest = counts[hand[order[bestIndex]].getFace()];
                boolean better = (countJ > countBest) ||
                    (countJ == countBest && hand[order[j]].getFace() > hand[order[bestIndex]].getFace());
                if (better) {
                    bestIndex = j;
                }
            }
            int temp = order[i];
            order[i] = order[bestIndex];
            order[bestIndex] = temp;
        }
 
        for (int i = 5 - drawCount; i < 5; i++) {
            hand[order[i]] = deck.dealCard();
        }
    }
 
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
 
        Card[] dealerHand = deck.dealHand(); // dealt face down
        System.out.println("(Dealer's hand is face down)");
        System.out.println("Internally: " + PokerEval.rankName(dealerHand));
 
        int toDraw = drawCount(dealerHand);
        System.out.println("Dealer draws " + toDraw + " card(s).");
        redraw(dealerHand, deck, toDraw);
 
        System.out.println("Dealer's hand is now: " + PokerEval.rankName(dealerHand));
    }
}

