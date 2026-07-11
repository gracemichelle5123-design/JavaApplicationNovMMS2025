//  3.22  Tabular Output ; Write a Java application that uses looping to print the table of values: N, 100*N, and 1000*N for N = 1 to 5.
public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t100*N\t1000*N");
        for (int n = 1; n <= 5; n++) {
            System.out.println(n + "\t" + (100 * n) + "\t" + (1000 * n));
        }
    }
}
