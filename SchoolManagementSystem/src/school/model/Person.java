package school.model;
import java.io.Serializable; 
import java.time.LocalDate; 
import java.time.Period;

public abstract class Person implements Serializable {
    private int id; 
    private String firstName; 
    private String lastName; 
    private LocalDate dateOfBirth;
    private Gender gender; 
    private String address; 
    private String phone; 
    private String email;
    
    public Person(int id, String firstName, String lastName, LocalDate dateOfBirth, Gender gender, String address, String phone, String email) {
        this.id = id; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.dateOfBirth = dateOfBirth;
        this.gender = gender; 
        this.address = address; 
        this.phone = phone; 
        this.email = email;
    }
    
    public int getId() { return id; } 
    public String getFirstName() { return firstName; } 
    public String getLastName() { return lastName; }
    
    public String getFullName() { 
        return firstName + " " + lastName; 
    }
    
    public int getAge() { 
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears(); 
    }
    
    public Gender getGender() { return gender; } 
    public String getPhone() { return phone; }
    
    @Override 
    public String toString() { 
        return "ID:" + id + " | " + getFullName() + " | Age:" + getAge() + " | " + phone; 
    }
}