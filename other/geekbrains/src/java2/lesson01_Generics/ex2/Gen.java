package java2.lesson01_Generics.ex2;

/**
 * Created by mega on 04.09.2016.
 */
//public class Gen(T) { // метафора
public class Gen<T> { // параметризованный тип
    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getMyTemplate() {
        return object;
    }

    public void setMyTemplate(T object) {
        this.object = object;
    }
}
