
import java.util.Scanner;
 
public class HeartRateApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("First name: ");
        String first = input.next();
        System.out.print("Last name: ");
        String last = input.next();
        System.out.print("Birth month (1-12): ");
        int month = input.nextInt();
        System.out.print("Birth day: ");
        int day = input.nextInt();
        System.out.print("Birth year: ");
        int year = input.nextInt();
 
        HeartRates person = new HeartRates(first, last, month, day, year);
 
        System.out.println("\n" + person.getFirstName() + " " + person.getLastName()
            + ", born " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.getAge());
        System.out.println("Maximum heart rate: " + person.getMaximumHeartRate());
        System.out.printf("Target heart rate range: %.0f - %.0f%n",
            person.getTargetHeartRateLow(), person.getTargetHeartRateHigh());
    }
}

