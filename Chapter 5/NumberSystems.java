// 5.34  Write an application that displays a table of the binary, octal, and hexadecimal equivalents of the decimal numbers 1 through 256.
public class NumberSystems {
 
    public static String toBinary(int number) {
        String result = "";
        while (number > 0) {
            result = (number % 2) + result;
            number = number / 2;
        }
        return result;
    }
 
    public static String toOctal(int number) {
        String result = "";
        while (number > 0) {
            result = (number % 8) + result;
            number = number / 8;
        }
        return result;
    }
 
    public static String toHex(int number) {
        String hexChars = "0123456789ABCDEF";
        String result = "";
        while (number > 0) {
            int digit = number % 16;
            result = hexChars.charAt(digit) + result;
            number = number / 16;
        }
        return result;
    }
 
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\tOctal\tHex");
        for (int n = 1; n <= 256; n++) {
            System.out.println(n + "\t" + toBinary(n) + "\t" + toOctal(n) + "\t" + toHex(n));
        }
    }
}


