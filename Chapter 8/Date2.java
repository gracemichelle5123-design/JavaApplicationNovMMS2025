// 8.14  Create class Date with three constructors: (month, day, year) as ints; (monthName, day, year); and (dayOfYear, year). Provide output methods for MM/DD/YYYY, Month DD, YYYY, and DDD YYYY formats.

public class Date2 {
    private int month, day, year;
    private static final String[] MONTH_NAMES = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    private static final int[] daysPerMonth =
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
    public Date2(int month, int day, int year) {
        this.month = month; this.day = day; this.year = year;
    }
 
    public Date2(String monthName, int day, int year) {
        this.day = day; this.year = year;
        for (int i = 1; i <= 12; i++) {
            if (MONTH_NAMES[i].equals(monthName)) { this.month = i; break; }
        }
    }
 
    public Date2(int dayOfYear, int year) {
        this.year = year;
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int remaining = dayOfYear, m = 1;
        while (m <= 12) {
            int dim = daysPerMonth[m] + ((m == 2 && leap) ? 1 : 0);
            if (remaining <= dim) break;
            remaining -= dim;
            m++;
        }
        this.month = m;
        this.day = remaining;
    }
 
    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
 
    public String toMonthDDYYYY() {
        return MONTH_NAMES[month] + " " + day + ", " + year;
    }
 
    public String toDDDYYYY() {
        int total = day;
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        for (int m = 1; m < month; m++) {
            total += daysPerMonth[m] + ((m == 2 && leap) ? 1 : 0);
        }
        return total + " " + year;
    }
}
