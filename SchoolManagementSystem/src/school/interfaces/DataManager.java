package school.interfaces;
import school.model.Student;
import java.util.List;

public interface DataManager {
    void saveToFile(List<Student> students);
    List<Student> loadFromFile();
}