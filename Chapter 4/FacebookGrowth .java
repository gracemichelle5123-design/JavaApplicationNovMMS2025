// 4.32  Facebook User Base Growth
public class FacebookGrowth {
    public static void main(String[] args) {
        double growthRate = 0.04;
 
        double users = 1.0;
        int month = 0;
        while (users < 1.5) {
            month++;
            users *= (1.0 + growthRate);
        }
        System.out.println("Months to reach 1.5 billion users: " + month);
 
        users = 1.0;
        month = 0;
        while (users < 2.0) {
            month++;
            users *= (1.0 + growthRate);
        }
        System.out.println("Months to reach 2 billion users: " + month);
    }
}

