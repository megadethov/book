package generics;

public class Pair<T, K> {
    public Pair(T a, K b) {
        this.a = a;
        this.b = b;
    }

    public final T a;
    public final K b;
}

