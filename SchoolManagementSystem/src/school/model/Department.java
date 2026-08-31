package school.model;
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Student> students; 

    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student s) { students.add(s); }
    public String getName() { return name; }
}