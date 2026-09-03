
package school.service;
import school.interfaces.DataManager;
import school.model.Student;
import school.model.Teacher;
import school.util.LoggerUtil;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
public class FileDataManager implements DataManager {
    private final String FILE_NAME = "school.dat";
    @Override public void saveStudent(Student s) {}
    @Override public void saveTeacher(Teacher t) {}
    @Override public Student getStudent(int id) { return null; }
    @Override public Teacher getTeacher(int id) { return null; }
    @Override
    public void saveAllStudents(Collection<Student> students) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(new ArrayList<>(students));
        } catch(Exception e){ LoggerUtil.log(Level.SEVERE, "Save students failed: " + e.getMessage()); }
    }
    @Override public void saveAllTeachers(Collection<Teacher> teachers) {}
    @Override
    public Collection<Student> getAllStudents() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            return (ArrayList<Student>) ois.readObject();
        } catch(Exception e){ return new ArrayList<>(); }
    }
    @Override public Collection<Teacher> getAllTeachers() { return new ArrayList<>(); }
    @Override public void saveToFile(Object obj) { saveAllStudents((Collection<Student>) obj); }
    @Override public Object loadFromFile() { return getAllStudents(); }
}