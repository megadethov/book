package java2.lesson01_Generics.ex3;

/**
 * Created by mega on 05.09.2016.
 */
// K - key, V - value, T - template, E - element
public class Gen<K, V> {
    K key;
    V value;

    public Gen(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (key == null) return "Object 1: " + "null" + " Object 2: " + value;
        else if (value == null) return "Object 1: " + key + " Object 2: " + "null";
        else if (value == null && key == null) return "Object 1: " + "null" + " Object 2: " + "null";
        else return "Object 1: " + key + " Object 2: " + value;

    }
}
