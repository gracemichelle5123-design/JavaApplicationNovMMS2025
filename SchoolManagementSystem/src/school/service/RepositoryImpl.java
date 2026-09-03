package school.service;

import school.interfaces.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RepositoryImpl<K, V> implements Repository<K, V> {
    private Map<K, V> map = new HashMap<>();

    @Override
    public void add(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public Collection<V> getAllValues() {
        return map.values();
    }
}