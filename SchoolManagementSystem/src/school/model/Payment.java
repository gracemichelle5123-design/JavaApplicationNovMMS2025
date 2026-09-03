package school.model;
import java.io.Serializable; 
import java.time.LocalDateTime;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    private double amount; 
    private LocalDateTime date;
    private PaymentMethod modeOfPayment; 
    private String studentId;

    public Payment(double amount, PaymentMethod modeOfPayment, String studentId) { 
        this.amount = amount; 
        this.date = LocalDateTime.now();
        this.modeOfPayment = modeOfPayment;
        this.studentId = studentId;
    }

    public double getAmount() { return amount; }
    public LocalDateTime getDate() { return date; }
    public PaymentMethod getModeOfPayment() { return modeOfPayment; }
    public String getStudentId() { return studentId; }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", date=" + date +
                ", mode=" + modeOfPayment +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}