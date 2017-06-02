package java2.lesson01_Generics.ex3;

/**
 * Created by mega on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> gen = new Gen<Integer, String>(10, "Hello");
        System.out.println(gen);
    }
}
