public class SingleArrsDirectInitialization {
	public static void main (String[] args ) {
	
	// direct initialization, the [] being one means it is a single dimensional array
	
	int [] numbers = {70,90,78,80,100,69,87,59,91,17};
	
	int addition = numbers[8] + numbers[2];
	
	boolean isGreater = numbers[8] > numbers[2];
	
	System.out.printf("Element at index 7 is %d%n", numbers[7]);
	System.out.printf("The sum of the numbers is %d%n", addition);
	System.out.printf("is numbers[8] > numbers[2] = %b%n", isGreater);
	
	System.out.println("Transversing through my array");
	for (int i = 0; i < 10; i++) {
		System.out.printf("Element at %d is %d%n",i,numbers[i]);
	}
}
	}
