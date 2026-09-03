package school.model;
import java.io.Serializable;

public class Enrollment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Student student;
    private String courseCode;
    private double score;

    public Enrollment(Student student, String courseCode, double score) {
        this.student = student;
        this.courseCode = courseCode;
        this.score = score;
    }

    public Student getStudent() { 
        return student; 
    }
    
    public String getCourse() { 
        return courseCode; 
    }
    
    public double getScore() { 
        return score; 
    }
    
    public void setScore(double score) { 
        this.score = score; 
    }
}