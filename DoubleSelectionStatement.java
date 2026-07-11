import java.util.Scanner;

public class DoubleSelectionStatement{
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter username: ");
	String userName = scan.nextLine(); 

	System.out.print("Enter password: ") ;
	String passWord = scan.nextLine() ;
	
	if(passWord.equals ("Meme2566") && userName.equals("Ghear@williams")) {
	System.out.printf("Access Granted, You are welcome");
	}
	else {
		System.out.println("Incorrect password or username");
	}
}
}