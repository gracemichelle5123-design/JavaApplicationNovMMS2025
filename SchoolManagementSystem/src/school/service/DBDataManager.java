package school.service;
import school.interfaces.DataManager;
import school.model.Student;
import java.util.List;

public class DBDataManager implements DataManager {
    @Override
    public void saveToFile(List<Student> students) {
        DB.saveStudents(students); 
    }

    @Override
    public List<Student> loadFromFile() {
        return DB.loadStudents(); 
    }
}