package full_guide.part_01.chapter_14_Generics._10_GenericConstructor;

/**
 * Created by mega on 05.09.2016.
 */
// Конструкторы могут быть обобщенными даже в не обобщенных классах
public class GenConstructor {
    private double value;
// T может принимать значения: Integer, Double, Float...(наследники Number)
    public <T extends Number> GenConstructor(T obj) {
        value = obj.doubleValue();
    }

    void showValue() {
        System.out.println("value = " + value);
    }
}
class Test {
    public static void main(String[] args) {
        GenConstructor obj = new GenConstructor(10.2F);
        GenConstructor obj2 = new GenConstructor(10);

        obj.showValue();
        obj2.showValue();
    }
}



