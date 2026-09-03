package school.model;
import java.util.ArrayList; import java.util.List;
public class Department {
    private int id; private String name; private List<Student> students = new ArrayList<>();
    public Department(int id, String name) { this.id = id; this.name = name; }
    public int getId() { return id; } public String getName() { return name; }
    public void addStudent(Student s) { students.add(s); }
    public List<Student> getStudents() { return students; }
    public double getAverageGPA() { return students.stream().mapToDouble(Student::getGPA).average().orElse(0); }
    @Override public String toString() { return id + ". " + name + " | Students: " + students.size() + " | Avg GPA: " + String.format("%.2f", getAverageGPA()); }
}