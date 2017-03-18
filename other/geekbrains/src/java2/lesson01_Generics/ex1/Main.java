package java2.lesson01_Generics.ex1;

/**
 * Created by mega on 04.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        NonGen intObject = new NonGen(10);
        NonGen strObject = new NonGen("Hello");

        String s = (String) strObject.getObject();
        Integer i = (Integer) intObject.getObject();

        System.out.println(s);
        System.out.println(i);
// Компилятор пропускает, но в runtime - ClassCastException
        s = (String) intObject.getObject();
    }
}
