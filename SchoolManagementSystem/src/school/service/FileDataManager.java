package school.service;
import school.interfaces.DataManager;
import school.model.Student;
import java.io.*;
import java.util.*;

public class FileDataManager implements DataManager {
    private final String FILE = "students.dat";

    @Override
    public void saveToFile(List<Student> students) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(students);
        } catch(IOException e) { e.printStackTrace(); }
    }

    @Override
    public List<Student> loadFromFile() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<Student>) ois.readObject();
        } catch(Exception e) { return new ArrayList<>(); }
    }
}