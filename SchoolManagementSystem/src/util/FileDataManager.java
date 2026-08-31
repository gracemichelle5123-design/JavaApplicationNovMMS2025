package util;

import model.Student;
import java.io.*;
import java.util.ArrayList;

public class FileDataManager {
    private static final String FILE_NAME = "students.dat";

    public static void saveStudents(ArrayList<Student> students) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Saved " + students.size() + " students to " + FILE_NAME);
        } catch(IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Student> loadStudents() {
        File file = new File(FILE_NAME);
        if(!file.exists()) return new ArrayList<>();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Student>) ois.readObject();
        } catch(Exception e) {
            System.out.println("No previous data found. Starting fresh.");
            return new ArrayList<>();
        }
    }
}