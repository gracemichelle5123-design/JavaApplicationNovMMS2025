package school.service;

import school.interfaces.*;
import school.model.*;
import school.exception.DuplicateIDException;
import java.util.*;

public class SchoolService implements CRUDOperations, ReportOperations {
    
    private List<Student> students;
    private DataManager fileManager = new FileDataManager();
    private DataManager dbManager = new DBDataManager();

    public SchoolService() {
        students = fileManager.loadFromFile();
    }

    @Override
    public void registerStudent(Student s) throws DuplicateIDException {
        for(Student st : students) {
            if(st.getId() == s.getId()) {
                throw new DuplicateIDException("ID already exists: " + s.getId());
            }
        }
        students.add(s);
        System.out.println("Student registered successfully!");
    }

    public void registerStudent(int id, String name, int age, Gender gender, double fee) throws DuplicateIDException {
        Student s = new Student(id, name, age, gender, fee, StudentLevel.LEVEL_100); // default level
        registerStudent(s);
    }

    @Override
    public Student searchStudent(int id) {
        for(Student s : students) {
            if(s.getId() == id) return s;
        }
        return null;
    }

    @Override
    public void viewAll() {
        if(students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for(Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public double averageFee() {
        if(students.isEmpty()) return 0;
        double sum = 0;
        for(Student s : students) sum += s.getFee();
        return sum / students.size();
    }

    @Override
    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name");
    }

    public void saveToFile() {
        fileManager.saveToFile(students);
        System.out.println("Saved to students.dat");
    }

    public void saveToDB() {
        dbManager.saveToFile(students);
        System.out.println("Saved to Database");
    }
}