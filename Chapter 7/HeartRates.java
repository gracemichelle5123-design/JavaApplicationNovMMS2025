// Making a Difference
// 7.22  Target-Heart-Rate Calculator

import java.time.LocalDate;

public class HeartRates {
    private String firstName, lastName;
    private int birthMonth, birthDay, birthYear;
 
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
 
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay; }
    public int getBirthYear() { return birthYear; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
 
    public int getAge() {
        java.time.LocalDate today = java.time.LocalDate.now();
        int age = today.getYear() - birthYear;
        if (today.getMonthValue() < birthMonth ||
           (today.getMonthValue() == birthMonth && today.getDayOfMonth() < birthDay)) {
            age--;
        }
        return age;
    }
 
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }
 
    public double getTargetHeartRateLow() { return getMaximumHeartRate() * 0.50; }
    public double getTargetHeartRateHigh() { return getMaximumHeartRate() * 0.85; }
}
