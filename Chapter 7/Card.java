// 1.	(Card Shuffling and Dealing) 
public class Card {
    private static final String[] FACES = {
        "", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
 
    private int face; // 1-13
    private int suit; // 0-3
 
    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }
 
    public int getFace() { return face; }
    public int getSuit() { return suit; }
 
    public String toString() {
        return FACES[face] + " of " + SUITS[suit];
    }
}
