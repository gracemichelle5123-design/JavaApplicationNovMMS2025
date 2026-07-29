// TO store 10 element in an array and display the count of all the even nos. and odd.

public class CountEvenOddStored {
	public static void main (String [] args ) {
	
		int [] numbers = {50,40,13,19,23,80,20,77,63,38};
		
		int evenCount=0;
		int oddCount=0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				evenCount++;
			}else{
				oddCount++;
			}
		}
		
		System.out.println("Total Even numbers:" + evenCount);
	    System.out.println("Total Odd numbers:" + oddCount);
	}
}