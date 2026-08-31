package school.model;
import java.io.Serializable;
import school.interfaces.Payable;
public class Teacher extends Person implements Payable, Serializable {
    private static final long serialVersionUID = 1L;
    private double salary;
    public Teacher(int id, String name, int age, Gender gender, double salary) {
        super(id,name,age,gender); this.salary=salary;
    }
    @Override public void printDetails() {
        System.out.println("ID: "+id+", Name: "+name+", Salary: "+salary);
    }
    @Override public void pay(double amount) { System.out.println(name + " received salary " + amount); }
}