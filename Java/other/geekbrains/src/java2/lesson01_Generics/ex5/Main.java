package java2.lesson01_Generics.ex5;

/**
 * Created by mega on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Gen<Integer> obj = new Gen<Integer>(10);  // здесь выбрали T == Integer
        Gen<Integer> obj2 = new Gen<>(20);
        obj.delta(obj2);

        Gen<Float> obj3 = new Gen<>(30.0F);
//        obj.delta(obj3); // работает / не работает

    }
}
