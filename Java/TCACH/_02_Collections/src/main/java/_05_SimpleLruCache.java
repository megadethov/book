import java.util.LinkedHashMap;
import java.util.Map;

public class _05_SimpleLruCache {
    public static void main(String[] args) {
        SimpleLRUCache<Integer, String> cache = new SimpleLRUCache<>(2);
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");

        cache.get(2);
        cache.put(9, "z");

        System.out.println(cache); // 2=b, 9=z

    }
}


class SimpleLRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public SimpleLRUCache(int capacity) {
        super(capacity+1, 1.1F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}