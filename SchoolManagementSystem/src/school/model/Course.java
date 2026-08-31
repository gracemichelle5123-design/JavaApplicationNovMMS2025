package school.model;
import java.io.Serializable;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private String courseCode;
    private String courseName;
    private int units;
    private Teacher teacher; 

    public Course(String courseCode, String courseName, int units) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.units = units;
    }
    public void assignTeacher(Teacher teacher) { this.teacher = teacher; }
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public Teacher getTeacher() { return teacher; }
}