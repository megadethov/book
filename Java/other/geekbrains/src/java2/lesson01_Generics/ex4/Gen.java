package java2.lesson01_Generics.ex4;

/**
 * Created by mega on 05.09.2016.
 */
//public class Gen<T, которые являются Number или его потомками> {
public class Gen<T extends Number> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    void show() {
//        System.out.println(((Number) obj).doubleValue()); // работает только для Number, "-" ошибки в runtime
        System.out.println(obj.doubleValue());
    }
}
