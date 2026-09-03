package school.interfaces;

import java.util.Collection;

public interface Repository<K, V> {
    void add(K key, V value);
    V get(K key);
    void remove(K key);
    Collection<V> getAllValues();
}