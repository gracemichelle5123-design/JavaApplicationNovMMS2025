package school.interfaces;
import java.util.List;
public interface Repository<T> {
    void save(int id, T t);
    T findById(int id);
    List<T> findAll();
    void delete(int id);
}