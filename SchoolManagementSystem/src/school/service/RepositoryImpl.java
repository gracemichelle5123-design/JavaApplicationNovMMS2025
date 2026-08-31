package school.service;
import school.interfaces.Repository;
import java.util.*;
public class RepositoryImpl<T> implements Repository<T> {
    private Map<Integer, T> data = new HashMap<>();
    public void save(int id, T t){data.put(id,t);}
    public T findById(int id){return data.get(id);}
    public List<T> findAll(){return new ArrayList<>(data.values());}
    public void delete(int id){data.remove(id);}
}