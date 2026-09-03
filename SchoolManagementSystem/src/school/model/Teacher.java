package school.model;
import java.time.LocalDate;
public class Teacher extends Person {
    private String specialization; private double salary;
    public Teacher(int id, String fn, String ln, LocalDate dob, Gender g, String addr, String phone, String email, String specialization, double salary) {
        super(id, fn, ln, dob, g, addr, phone, email);
        this.specialization = specialization; this.salary = salary;
    }
    public String getSpecialization() { return specialization; }
    @Override public String toString() { return "ID:" + getId() + " | " + getFullName() + " | Subject:" + specialization; }
}