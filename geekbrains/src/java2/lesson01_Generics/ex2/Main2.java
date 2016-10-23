package java2.lesson01_Generics.ex2;


/**
 * Created by mega on 04.09.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        Gen<Integer> intObject = new Gen<>(10);
        Gen<String> strObject = new Gen<>("Hello");
        // raw type without generics. Оставили для обратной совместимости со старым кодом
        Gen rawObject = new Gen(10); // По умолчанию типизируется <Object>

        String s = strObject.getMyTemplate();
        Integer i = intObject.getMyTemplate();

//        String str = (String) rawObject.getMyTemplate(); // need cast here and get runtime ClassCastException
        Integer i2 = (Integer) rawObject.getMyTemplate(); // need cast here
        System.out.println(s);
        System.out.println(i);
// Теперь компилятор не пропускает.
//        s = (String) intObject.getMyTemplate();
    }
}
