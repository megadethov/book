package java2.lesson01_Generics.ex4;

/**
 * Created by mega on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Gen<Integer> gen = new Gen<>(10);
        gen.show();

//        Gen<String> genStr = new Gen<String>("Hello"); // compile error
    }
}
