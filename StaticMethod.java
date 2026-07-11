public class StaticMethod{
	
	// method
	
	public static void main (String[] args) {
	System.out.println(addNumber(8,45,23));
	System.out.println(addNumber(100,500));
	System.out.println(addNumber(10,50,342));
	System.out.println(addNumber(30,509));
	System.out.println(addNumber(190,230,900));
	System.out.println(addNumber(6,7,13));
	System.out.println(addNumber(140,340));
	System.out.println(addNumber(0,50));
	
	}

	//method 
	public static int addNumber(int num1 , int num2, int num3) {
		int addition = num1 + num2 + num3;
		
		return addition;
	}
	
	public static int addNumber (int num1, int num2) {
	int addition = num1  + num2;
	
	return addition;
	}
}