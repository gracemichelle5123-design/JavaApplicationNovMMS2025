package school.model;
import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Student student; 
    private double amount;
    private LocalDate date;

    public Payment(Student student, double amount) {
        this.student = student;
        this.amount = amount;
        this.date = LocalDate.now();
    }
    public double getAmount() { return amount; }
}