package java2.lesson01_Generics.ex7;

/**
 * Created by mega on 05.09.2016.
 */
// интерфейс Minimum должен быть типа <T extends Comparable>
// Comparable<T> - в свою очередь тоже типизирован (чтобы сравнивать объекты одного типа)

public interface Minimum<T extends Comparable<T>> { // <T> Comparable тоже расширяет Comparable
    T min();
}
