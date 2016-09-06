package full_guide.part_01.chapter_14._12_RawType;

/**
 * Created by mega on 06.09.2016.
 */
public class TestGen {
    public static void main(String[] args) {

        // создаем объект типа NonGen для целых чисел
        Gen<Integer> intObj = new Gen<>(100);

        // создаем объект типа NonGen для символьных строк
        Gen<String> strObj = new Gen<>("Hello");

        // создаем объект СЫРОГО типа NonGen для Double
        Gen rawObj = new Gen(0.55);

        // требуется приведение поскольку тип не известен
        double d = (double) rawObj.getObj();
        System.out.println("Value: " + d);

        int i = (Integer) rawObj.getObj(); // runtime error - ClassCastException

        strObj = rawObj; // верно, но потенциально опасно
        String str = strObj.getObj(); // runtime error

        rawObj = intObj; // верно, но потенциально ошибочно
        d = (Double) rawObj.getObj(); // runtime error
    }
}
