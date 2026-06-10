public class OperatorPart1{
   public static void main(String[] args ) {
   // Assignment operator(=)
   int age = 21;
     System.out.printf("You are %d years old%n",age);
   
   // Arithmetic Operator (+,-,*,/,%)
  int  num1=35;
  int  num2 = 100 ;
  
  int addition = num1 + num2;
  System.out.printf("The sum of %d + %d = %d%n" ,num1, num2 ,addition);
  
  int subtraction = num1 - num2;
  System.out.printf("The difference  between %d - %d = %d%n" ,num1, num2 ,subtraction );
  
 
int multiplication = num1 * num2;
  System.out.printf("The product of %d * %d = %d%n" ,num1, num2 ,multiplication );
 
  double division = (double)num1 / num2;
  System.out.printf("The  quotient of %d / %d = %2f%n" ,num1, num2 ,division);
 // %2f%n will give 0.350000 and %.2f%n will give 0.35
 
 
 int remainder = num1 % num2;
 System.out.printf( "The modulus of %d and %d is equal to %d%n", num1, num2, remainder);
 
// Compound Assignment Operator(
num1 += num2;
System.out.printf("The value of num1 has been updated to %d%n" ,num1);
 
num1 -= num2;
System.out.printf("The value of num1 has been updated to %d%n",num1);
  
num1 *= num2;
System.out.printf("The value of num1 has been updated to %d%n",num1);
  
num1 /= num2;
System.out.printf("The value of num1 has been updated to %d%n",num1);
  
num1 %= num2;
System.out.printf("The value of num1 has been updated to %d%n",num1);
  
// Realational Operator (or Comparison ) (>,<,>=,<=,==,!=)
int num3 = 10;
int num4 = 15;

boolean isGreater = num3 > num4;
System.out.printf("Is %d > %d? %b%n", num2, num4,isGreater);

boolean isLess = num3 < num4;
System.out.printf(" Is %d < %d? %b%n" ,num3,num4,isLess);

boolean isGreaterThanorEqual = num3 >= num4;
System.out.printf("Is %d >= %d ? %b%n" ,num3, num4 ,isGreaterThanorEqual);


boolean isLessThanorEqual = num3 <= num4;
System.out.printf("Is %d <= %d ? %b%n" ,num3, num4 ,isLessThanorEqual);


boolean isEqual = num3 == num4;
System.out.printf("Is %d == %d ? %b%n" ,num3, num4 ,isEqual);



boolean isNotEqual = num3 != num4;
System.out.printf("Is %d != %d ? %b%n" ,num3, num4 ,isNotEqual);



 }
   }