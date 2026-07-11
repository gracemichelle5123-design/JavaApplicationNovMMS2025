import java.util.Scanner;

public class CountALL{
	public static void main (String [] args) {
		Scanner input  = new Scanner(System.in);
		
		int number;
		int sum = 0;
		int positiveCount= 0;
		int negativeCount =0;
		int zeroCount = 0;
		
		while(true) {
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number == -1) {
            break;
		}
       
		
		
       if(number > 0 ) { 
	     positiveCount++;
	   }else if (number < 0 ) {
		   negativeCount++;
	   } else {
		   zeroCount++;
	   }
	}
	System.out.printf("Postive numbers: %d%n ",positiveCount);
	System.out.printf("Negative numbers: %d%n",negativeCount);
	System.out.printf("Zeros: %d%n",zeroCount);	
	
	
	}
}
	