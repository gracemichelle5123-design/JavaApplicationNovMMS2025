package school.interfaces;
import school.model.Student;
import school.exception.DuplicateIDException;

public interface CRUDOperations {
    void registerStudent(Student s) throws DuplicateIDException;
    Student searchStudent(int id);
    void sortByName();
    void viewAll();
}