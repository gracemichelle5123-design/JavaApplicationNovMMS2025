// 2.34 World Population Growth Calculator

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current world population: ");
        int population = input.nextInt();
        System.out.print("Enter annual growth rate (as whole number %): ");
        int rate = input.nextInt();

        int y1 = population + population * rate / 100;
        int y2 = y1 + y1 * rate / 100;
        int y3 = y2 + y2 * rate / 100;
        int y4 = y3 + y3 * rate / 100;
        int y5 = y4 + y4 * rate / 100;

        System.out.printf("Year 1: %d%n", y1);
        System.out.printf("Year 2: %d%n", y2);
        System.out.printf("Year 3: %d%n", y3);
        System.out.printf("Year 4: %d%n", y4);
        System.out.printf("Year 5: %d%n", y5);
        System.out.println("(Note: Use double type from Chapter 3 for more accurate results)");
    }
}
