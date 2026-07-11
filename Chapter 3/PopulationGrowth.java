// 3.39  World Population Growth
public class PopulationGrowth {
    public static void main(String[] args) {
        double population = 8_300_000_000.0;
        double growthRate = 0.0083; // 0.83% per year
        double startingPopulation = population;
        boolean doubledYetPrinted = false;
 
        System.out.println("Year\tPopulation\tIncrease");
 
        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;
 
            System.out.printf("%d\t%.0f\t%.0f%n", year, population, increase);
 
            if (!doubledYetPrinted && population >= 2 * startingPopulation) {
                System.out.println("--> Population would double by year " + year);
                doubledYetPrinted = true;
            }
        }
    }
}
