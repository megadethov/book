package ua.mega.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String, Flyweight> pool = new HashMap<>();

    {
        pool.put("1", new ConcreteFlyweight());
        pool.put("2", new ConcreteFlyweight());
        pool.put("3", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteFlyweight());
        }
        return pool.get(key);

    }
}
