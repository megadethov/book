package java2.lesson01_Generics.ex4;

/**
 * Created by mega on 05.09.2016.
 */
public class Gen2<T extends Animal> {
    T obj;

    public Gen2(T obj) {
        this.obj = obj;
    }

    void show() {
        System.out.println("Animal");
    }
}
