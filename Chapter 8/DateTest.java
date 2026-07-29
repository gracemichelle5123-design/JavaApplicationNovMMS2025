
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(7, 24, 2026);
        d1.nextDay();
        System.out.println(d1); 
 
        Date d2 = new Date(12, 31, 2026);
        d2.nextDay();
        System.out.println(d2); // next year
    }
}

