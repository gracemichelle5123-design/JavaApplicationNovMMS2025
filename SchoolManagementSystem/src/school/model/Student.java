package school.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;
    private Gender gender;
    private double fee;
    private StudentLevel level;
    private double score; 

    public Student(int id, String name, int age, Gender gender, double fee, StudentLevel level) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.fee = fee;
        this.level = level;
        this.score = 0.0;
    }

    
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }
    public double getFee() { return fee; }
    public StudentLevel getLevel() { return level; }
    public double getScore() { return score; }

    
	public void setScore(double score) { this.score = score; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + gender + " | " + level.getDescription() + " | Fee: " + fee;
    }
}