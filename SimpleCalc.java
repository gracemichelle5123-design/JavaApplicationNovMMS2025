public class SimpleCalc {
    public static void main(String[] args) {
        double[] nums = {2,4,6,8,10,1,3,5,7,9};
        double sum = 0, product = 1;
       
        for(double n : nums) {
            sum += n;
            product *= n;
        }
       
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/10);
        System.out.println("Product: " + product);
    }
}

