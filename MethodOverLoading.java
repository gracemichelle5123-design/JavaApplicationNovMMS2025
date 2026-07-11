import java.util.Scanner;


public class MethodOverLoading{
	public static void main (String [] args ) {
	
	Scanner scan = new Scanner (System.in);
	MethodOverLoading mol = new MethodOverLoading();
	
	System.out.println(" Calculating the perimeter of different shapes");
	System.out.println(" **************************** ");
	System.out.println(" Enter 1: For Square ");
	System.out.println(" Enter 2: For Rectangle ");
	System.out.println(" Enter 3: For Circle ");
	System.out.println(" Enter 4: For Trapezium");
	System.out.println(" Enter 5: to Exit ");
	System.out.println(" **************************** ");
	
	
	System.out.println(" **************************** ");
	System.out.print(" Enter your choice: ");
	int choice = scan.nextInt();
	
	
	switch(choice){
		case 1: 
		System.out.println(" You want to calculate the perimeter of a square");
		
		System.out.print("Please enter the length of the square: ");
		int lengthOfSquare = scan.nextInt();
		System.out.println(" **************************** ");
		
		System.out.printf(" The perimeter of the square is %d%n" ,mol.perimeter(lengthOfSquare)); 
	break;
	
	
	case 2: 
		System.out.println(" You want to calculate the perimeter of a rectangle");
		
		System.out.print("Please enter the length of the rectangle: ");
		int lengthOfRect = scan.nextInt();
		
		System.out.print("Please enter the breadth of the rectangle: ");
		int breadthOfRect = scan.nextInt();
		System.out.println(" **************************** ");
	
		System.out.printf(" The perimeter of the rectangle is %d%n", mol.perimeter(lengthOfRect, breadthOfRect)); 
	break;
	
	case 3: 
		System.out.println(" You want to calculate the perimeter of a circle");
		
		System.out.print("Please enter the radius of the circle: ");
	    double radius  = scan.nextDouble();
		
	
		System.out.printf(" The perimeter of the circle is %d%n" ,mol.perimeter(radius)); 
	break;
	
	case 4: 
		System.out.println(" You want to calculate the perimeter of a trapezium");
		
		System.out.print("Please enter the side1 of the trapezium: ");
		int side1 = scan.nextInt();
		
		System.out.print("Please enter the side2 of the trapezium : ");
		int side2 = scan.nextInt();
		
		System.out.print("Please enter the side3 of the trapezium: ");
		int side3 = scan.nextInt();
		
		System.out.print("Please enter the side4 of the trapezium: ");
		int side4 = scan.nextInt();
		
	
		System.out.printf(" The perimeter of the trapezium is %d%n" ,mol.perimeter(side1, side2, side3, side4)); 
	break;
	default:
           System.out.println(" Program exited, Bye for now.........");
	
	}	
	
	}
	// The PI that is in capital letter it is to show that it is constant .
	// We know that is an insatnce method cuz there is no starting keyword. Perimeter for square; 4* side , rectangle; 2l+2b, circle; 2pi.r, trapezium; a+b+c+d.
	public int perimeter( int length ) {
		int per = 4 * length  ;
		return per;

	}

    public int perimeter (int length, int breadth) {
	 int per = 2 * (length + breadth) ;
	 return per; 
	 
 }
    public double  perimeter (double radius) {
	 double per = 2 * Math.PI * radius;
	 return per; 
	
	}
	
public int perimeter (int side1, int side2, int side3, int side4) {
	 int per = side1 + side2 + side3 + side4;
	 return per; 
	
}

}


