// 6.18  
import java.util.Scanner;
 
public class AirlineReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] seats = new boolean[11]; // 1-5 First Class, 6-10 Economy
 
        System.out.println("Type 1 for First Class, 2 for Economy, 0 to stop");
        int choice = input.nextInt();
 
        while (choice != 0) {
            int preferredFrom = (choice == 1) ? 1 : 6;
            int preferredTo = (choice == 1) ? 5 : 10;
            int otherFrom = (choice == 1) ? 6 : 1;
            int otherTo = (choice == 1) ? 10 : 5;
            String preferredName = (choice == 1) ? "First Class" : "Economy";
            String otherName = (choice == 1) ? "Economy" : "First Class";
 
            int seat = findSeat(seats, preferredFrom, preferredTo);
            if (seat != -1) {
                seats[seat] = true;
                System.out.println("Boarding pass: seat " + seat + ", " + preferredName);
            } else {
                System.out.print(preferredName + " is full. Accept " + otherName + " instead? (1=yes, 0=no): ");
                if (input.nextInt() == 1) {
                    seat = findSeat(seats, otherFrom, otherTo);
                    if (seat != -1) {
                        seats[seat] = true;
                        System.out.println("Boarding pass: seat " + seat + ", " + otherName);
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                    }
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
            System.out.println("Type 1 for First Class, 2 for Economy, 0 to stop");
            choice = input.nextInt();
        }
    }
 
    static int findSeat(boolean[] seats, int from, int to) {
        for (int i = from; i <= to; i++) {
            if (!seats[i]) return i;
        }
        return -1;
    }
}

