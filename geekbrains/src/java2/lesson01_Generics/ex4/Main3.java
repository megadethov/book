package java2.lesson01_Generics.ex4;

/**
 * Created by mega on 05.09.2016.
 */
public class Main3 {
    public static void main(String[] args) {
        Gen3<Cat> obj = new Gen3<>(new Cat());
//        Gen3<Animal> obj2 = new Gen3<> (new Animal()); // compile error, потому что Animal не implements Miauable
    }
}
