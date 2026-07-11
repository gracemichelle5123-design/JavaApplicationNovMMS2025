// 4.12 Write an application that calculates the product of the odd integers from 1 to 15.

public class OddProduct {
    public static void main(String[] args) {
        long product = 1;
 
        for (int number = 1; number <= 15; number += 2) {
            product *= number;
        }
 
        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}
