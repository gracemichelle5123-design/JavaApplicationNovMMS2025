package school.model;
import java.time.LocalDate; 
import java.util.HashMap; 
import java.util.Map;

public class Student extends Person {
    private double gpa; 
    private StudentLevel level; 
    private Department department;
    private Map<Course, Double> grades = new HashMap<>(); 
    
    public Student(int id, String fn, String ln, LocalDate dob, Gender g, String addr, String phone, String email, double gpa, StudentLevel level, Department dept) {
        super(id, fn, ln, dob, g, addr, phone, email);
        this.gpa = gpa; 
        this.level = level; 
        this.department = dept; 
        dept.addStudent(this);
    }
    
    public double getGPA() { return gpa; } 
    public StudentLevel getLevel() { return level; } 
    public Department getDepartment() { return department; }
    
    public void addGrade(Course c, double score) { 
        grades.put(c, score); 
        calculateGPA(); 
    }
    
    private void calculateGPA() { 
        if(grades.isEmpty()) { 
            this.gpa = 0; 
            return; 
        }
        double total = grades.values().stream().mapToDouble(d->d).sum();
        this.gpa = (total / grades.size()) / 25.0; 
        if(this.gpa > 4.0) this.gpa = 4.0; 
    }
    
    public Map<Course, Double> getGrades() { return grades; }
    
    @Override 
    public String toString() { 
        return "ID:" + getId() + " | " + getFullName() + " | " + level + " | " + department.getName() + " | GPA:" + String.format("%.2f", gpa); 
    }
}