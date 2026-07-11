// 3.17  Gas Mileage
import java.util.Scanner;
 
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;
 
        System.out.print("Enter miles (-1 to quit): ");
        int miles = input.nextInt();
 
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
 
            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon this trip: %.2f%n", milesPerGallon);
 
            totalMiles += miles;
            totalGallons += gallons;
 
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", combinedMPG);
 
            System.out.print("Enter miles (-1 to quit): ");
            miles = input.nextInt();
        }
        System.out.println("Done. Thanks!");
    }
}
