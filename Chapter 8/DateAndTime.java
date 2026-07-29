// 8.12  Combining Class Time2 with Class Date
.
public class DateAndTime {
    private Date date;
    private int hour, minute, second;
 
    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        date = new Date(month, day, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
 
    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }
 
    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
            date.nextDay(); // <-- the key addition
        }
    }
 
    public String toUniversalString() {
        return date + " " + String.format("%02d:%02d:%02d", hour, minute, second);
    }
 
    public String toString() { return toUniversalString(); }
}
