public class DeckOfCardsEnumDemo {
    enum Face { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }
    enum Suit { HEARTS, DIAMONDS, CLUBS, SPADES }
 
    static class Card2{
        private final Face face;
        private final Suit suit;
 
        public Card2(Face face, Suit suit) {
            this.face = face;
            this.suit = suit;
        }
 
        public Face getFace() { return face; }
        public Suit getSuit() { return suit; }
 
        public String toString() {
            return face + " of " + suit;
        }
    }
 
    public static void main(String[] args) {
        Card2[] deck = new Card2[52];
        int index = 0;
 
        for (Suit suit : Suit.values()) {
            for (Face face : Face.values()) {
                deck[index++] = new Card2(face, suit);
            }
        }
 
    java.security.SecureRandom rng = new java.security.SecureRandom();
    for (int i = deck.length - 1; i > 0; i--) {
        int j = rng.nextInt(i + 1);
        Card2 temp = deck[i];
        deck[i] = deck[j];
        deck[j] = temp;
    }

    
    System.out.println("10 random cards:\n");
    for (int i = 0; i < 10; i++) {
        System.out.println(deck[i]);
    }
}
}
 
 
 
 
 
      

