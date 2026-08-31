package school.model;
import java.io.Serializable;

public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int id;
    protected String name; 
    protected int age;
    protected Gender gender;

    public Person(int id, String name, int age, Gender gender) {
        this.id = id; this.name = name; this.age = age; this.gender = gender;
    }
    public abstract void printDetails(); 

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}