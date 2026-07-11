// 2.35 Car-Pool Savings Calculator

import java.util.Scanner;

public class CarPool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        int miles = input.nextInt();
        System.out.print("Enter cost per gallon of gasoline (in cents): ");
        int costPerGallon = input.nextInt();
        System.out.print("Enter average miles per gallon: ");
        int mpg = input.nextInt();
        System.out.print("Enter parking fees per day (in cents): ");
        int parking = input.nextInt();
        System.out.print("Enter tolls per day (in cents): ");
        int tolls = input.nextInt();

        int gasolineCost = (miles * costPerGallon) / mpg;
        int totalCost = gasolineCost + parking + tolls;

        System.out.printf("Your daily driving cost is %d cents%n", totalCost);
    }
}
