package school.model;

public class Enrollment {
    private Student student;
    private String course;
    private double score;

    public Enrollment(Student student, String course, double score) {
        this.student = student;
        this.course = course;
        this.score = score;
        student.setScore(score); 
        System.out.println(student.getName() + " enrolled in " + course + " with score: " + student.getScore());
    }
}