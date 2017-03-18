package java2.lesson01_Generics.ex8;

/**
 * Created by mega on 05.09.2016.
 */
public class Gen2<T extends Number> {
    T number;

    void f() {

        // так нельзя
//        Gen2<Integer>[] arr;
//        arr = new Gen2<Integer>[3];

        // а так работает
        Gen2<?>[] arr2;
        arr2 = new Gen2<?>[3];
    }

}
