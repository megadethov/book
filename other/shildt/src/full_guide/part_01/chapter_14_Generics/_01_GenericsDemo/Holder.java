package full_guide.part_01.chapter_14_Generics._01_GenericsDemo;

/**
 * Created by mega on 02.09.2016.
 */
// class Holder - для любых типов - Т
public class Holder<T> {
    T ref;

    public Holder(T ref) {
        this.ref = ref;
    }

    public T getRef() {
        return ref;
    }

    public void print() {
        System.out.println(getRef().toString());
        System.out.println(getRef().getClass().getName());
    }

}

class Test {
    public static void main(String[] args) {

        Holder<Double> holder = new Holder<>(100.0);
        holder.print();

        Holder<String> holder1 = new Holder<>("Hello");
        holder1.print();

//        Holder<int> holder2 = new int<>(10); // примитивные типы не работают
//        holder = holder1; // разные типы, компилятор следит
    }

}
