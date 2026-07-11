// Write a program that will return the name of the student when it is being called
import java.util.Scanner;

public class ClassWork4{
	public static String getStudentName(){
	Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String name = input.nextLine();
		return 	name;
	}
public static void main (String [] args) {
	String studentName = getStudentName();
	
		System.out.println("Student name is : " + studentName);
	 
	}
}