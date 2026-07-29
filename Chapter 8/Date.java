// 8.8  Enhancing Class Date
public class Date {
    private int month, day, year;
    private static final int[] daysPerMonth =
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        if (year < 1)
            throw new IllegalArgumentException("year (" + year + ") must be 1 or greater");
        if (day <= 0 || day > daysInMonth(month, year))
            throw new IllegalArgumentException("day (" + day + ") out-of-range");
 
        this.month = month;
        this.day = day;
        this.year = year;
    }
 
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
 
    private static int daysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysPerMonth[month];
    }
 
    public void nextDay() {
        day++;
        if (day > daysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }
 
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
