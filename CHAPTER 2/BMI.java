// 2.33 BMI Calculator

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int weightPounds = input.nextInt();
        System.out.print("Enter height in inches: ");
        int heightInches = input.nextInt();

        // BMI = (weight in pounds * 703) / (height in inches)^2
        int bmi = (weightPounds * 703) / (heightInches * heightInches);

        System.out.printf("Your BMI is %d%n", bmi);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
