// 4.13 Write an application that calculates the factorials of 1 through 20. Use type long. Display the results in tabular format. What difficulty might prevent you from calculating the factorial of 100? 
public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;
 
        System.out.println("Number\tFactorial");
 
        for (int number = 1; number <= 20; number++) {
            factorial *= number;
            System.out.println(number + "\t" + factorial);
        }
    }
}

