package full_guide.part_01.chapter_14._03_TwoParametrGenerics;

/**
 * Created by mega on 03.09.2016.
 */
// Два параметра в generics
public class Test {
    public static void main(String[] args) {
        Holder holder = new Holder("Hello", 1000);
        Holder holder2 = new Holder("Hello", "World");

        holder.print();
        holder2.print();
    }
}

class Holder<T, V> {
    T oneRef;
    V twoRef;

    public Holder(T oneRef, V twoRef) {
        this.oneRef = oneRef;
        this.twoRef = twoRef;
    }

    public T getOneRef() {
        return oneRef;
    }

    public V getTwoRef() {
        return twoRef;
    }

    public void print() {
        System.out.println(oneRef);
        System.out.println(twoRef);
        System.out.println(oneRef.getClass().getName());
        System.out.println(twoRef.getClass().getName());
    }
}
