package full_guide.part_01.chapter_14_Generics._11_GenericInterface;

/**
 * Created by mega on 06.09.2016.
 */
// Реализация интерфейса
public class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] arrObj;

    public MyClass (T[] arrObj) {
        this.arrObj = arrObj;
    }

    @Override
    public T min() {
        T result = arrObj[0];
        for (int i = 1; i < arrObj.length; i++) {
            if (arrObj[i].compareTo(result) < 0) result = arrObj[i];
        }
        return result;
    }

    @Override
    public T max() {
       T result = arrObj[0];
        for (int i = 0; i < arrObj.length; i++) {
            if(arrObj[i].compareTo(result) > 0) result = arrObj[i];
        }
        return result;
    }
}
