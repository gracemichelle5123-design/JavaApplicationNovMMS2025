// 7.21  
import java.security.SecureRandom;
 
public class FisherYatesDemo {
    public static void main(String[] args) {
        Integer[] deck = new Integer[10];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i + 1;
        }
 
        System.out.print("Before shuffle: ");
        printDeck(deck);
 
        shuffle(deck);
 
        System.out.print("After shuffle:  ");
        printDeck(deck);
    }
 
    public static void shuffle(Integer[] deck) {
        SecureRandom rng = new SecureRandom();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rng.nextInt(i + 1);   // random index from 0 to i, inclusive
            Integer temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
 
    static void printDeck(Integer[] deck) {
        for (int card : deck) System.out.print(card + " ");
        System.out.println();
    }
}