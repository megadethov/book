package java2.lesson01_Generics.ex6;

/**
 * Created by mega on 05.09.2016.
 */
public class Main {
    int i;

    public static void main(String[] args) {
        show(new Animal(), 12);
    }
// если обобщается только метод без класса, то объявление вставляется перед возвращаемым значением
    private static <T, V> void show(T ob, V i) {
    }
}
