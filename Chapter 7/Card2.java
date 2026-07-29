
public class Card2 {
    private final Face face;
    private final Suit suit;
 
    public Card2(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }
 
    public Face getFace() { return face; }
    public Suit getSuit() { return suit; }
 
    public String toString() {
        return face + " of " + suit;    }
}

