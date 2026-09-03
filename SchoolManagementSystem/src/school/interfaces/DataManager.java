package school.interfaces;
import school.model.Student;
import school.model.Teacher;
import java.util.Collection;
public interface DataManager {
    void saveStudent(Student s);
    void saveTeacher(Teacher t);
    Student getStudent(int id);
    Teacher getTeacher(int id);
    void saveAllStudents(Collection<Student> students);
    void saveAllTeachers(Collection<Teacher> teachers);
    Collection<Student> getAllStudents();
    Collection<Teacher> getAllTeachers();
    void saveToFile(Object obj);
    Object loadFromFile();
}