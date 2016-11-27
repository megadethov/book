package se.lecture_01_AdvancedClasses.nested_static;

/**
 * Created by Yefremov Yuriy
 */
// Nested - вложенный статический класс
public class OuterClass { // Внешний класс
// Разные поля
    public int a = 10;
    private int b = 10;
    private final int c = 10;
    private static int d = 10;
    private static final int e = 10;

    // в методах Внешнего класса можем создавать инстансы Вложенного
    public void outerMethod() {
        NestedClass nestedClass = new NestedClass();
        nestedClass.nestedMethod();
    }

    static class NestedClass {
        static int s; // теперь я в статике могу объявлять статику
        int ss;
        final int sss = 100;

        public void nestedMethod() { //Не можем обращаться к нестатическим переменным.
            //System.out.println(a); //не компилируется
            //System.out.println(b); //не компилируется
            //System.out.println(c); //не компилируется
            System.out.println(d);
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
        System.out.println("----------------------");
        // из статик меода Внешнего можно напрямую создавать инстанс Вложенного
        NestedClass nestedClass = new NestedClass();
        nestedClass.nestedMethod();
    }
}
