package java2.lesson01_Generics.ex7;

/**
 * Created by mega on 05.09.2016.
 */
//public class MainCollection<T extends Comparable<T> & Minimum<T extends Comparable<T>> { // метафора

    // Объекты типа <T> коллекции должны быть Comparable и реализовывать метод интерфейса Minimum
public class MainCollection<T extends Comparable<T>> implements Minimum<T> { // достаточно Minimum<T>
    T[] arr;

    public MainCollection(T[] arr) {
        this.arr = arr;
    }


    @Override
    public T min() {
        T res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr == null || arr.length < 1) return null;
            if (arr[i].compareTo(res) < 0) {
                res = arr[i];
            }
        }
        return res;
    }
}
