// Write a java method to accept 10 numbers, find sum of 6 -9 number,and sum of 2,4,9 numbers, divide it by the sum of second to fifth number and display the results.
import java.util.Scanner;

public class SumAddDivide{
	public static void main (String [] args) {
	  Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
		
		System.out.println("Enter 10 numbers: ");
		
		for (int i = 0; i < 10 ; i++) {
			System.out.printf("Number:" );
			numbers[i] = sc.nextInt();
			}
	
	int sum1 = numbers[5] + numbers [6] + numbers [7] + numbers [8];
	
	int sum2 = numbers[1] + numbers [3] + numbers [8] ;
	//numerator = sum1 + sum2;
	
	int sum3 =  numbers [1] +  numbers [2] + numbers [3] + numbers [4];
	
    double ans = (double)(sum1 + sum2 )/ sum3;
	
	System.out.printf("The answer is: %.2f", ans);
	}
}