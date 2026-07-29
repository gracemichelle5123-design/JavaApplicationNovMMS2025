// 6.28  
public class TortoiseHare {
    public static void main(String[] args) {
        int tortoise = 1, hare = 1;
        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");
 
        while (tortoise < 70 && hare < 70) {
            int tortoiseMove = (int) (Math.random() * 10) + 1;
            if (tortoiseMove <= 5) tortoise += 3;        // fast plod, 50%
            else if (tortoiseMove <= 7) tortoise -= 6;    // slip, 20%
            else tortoise += 1;                           // slow plod, 30%
            if (tortoise < 1) tortoise = 1;
 
            int hareMove = (int) (Math.random() * 10) + 1;
            if (hareMove <= 2) { /* sleep, 20%, no move */ }
            else if (hareMove <= 4) hare += 9;            // big hop, 20%
            else if (hareMove == 5) hare -= 12;           // big slip, 10%
            else if (hareMove <= 8) hare += 1;            // small hop, 30%
            else hare -= 2;                                // small slip, 20%
            if (hare < 1) hare = 1;
 
            printRace(tortoise, hare);
        }
 
        if (tortoise >= 70 && hare >= 70) System.out.println("It's a tie!");
        else if (tortoise >= 70) System.out.println("TORTOISE WINS!!! YAY!!!");
        else System.out.println("Hare wins. Yuch.");
    }
 
    static void printRace(int tortoise, int hare) {
        char[] line = new char[70];
        java.util.Arrays.fill(line, ' ');
 
        if (tortoise == hare && tortoise <= 70) {
            String collide = "OUCH!!!";
            for (int i = 0; i < collide.length() && tortoise - 1 + i < 70; i++) {
                line[tortoise - 1 + i] = collide.charAt(i);
            }
        } else {
            if (tortoise <= 70) line[tortoise - 1] = 'T';
            if (hare <= 70) line[hare - 1] = 'H';
        }
        System.out.println(new String(line));
    }
}

