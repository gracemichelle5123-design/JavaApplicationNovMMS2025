
public class DateAndTimeTest {
    public static void main(String[] args) {
        DateAndTime dt = new DateAndTime(1, 31, 2026, 23, 59, 0);
        System.out.println(dt);
        dt.incrementMinute();
        System.out.println(dt);
    }
}

