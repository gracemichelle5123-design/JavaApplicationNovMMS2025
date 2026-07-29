// 6.14  Write a method product that receives a variable-length argument list of integers and returns their product. Test with several calls.

public class VarArgsProduct {
    public static int product(int... numbers) {
        int result = 1;
        for (int n : numbers) {
            result *= n;
        }
        return result;
    }
 
    public static void main(String[] args) {
        System.out.println("product(2,3) = " + product(2, 3));
        System.out.println("product(2,3,4) = " + product(2, 3, 4));
        System.out.println("product(1,2,3,4,5) = " + product(1, 2, 3, 4, 5));
    }
}
