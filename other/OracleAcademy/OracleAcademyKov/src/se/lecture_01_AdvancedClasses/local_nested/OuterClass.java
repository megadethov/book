package se.lecture_01_AdvancedClasses.local_nested;

/**
 * Created by Yefremov Yuriy
 */
// Local Nested - класс внутри метода или блока
public class OuterClass { // Внешний класс
    // Разные поля
    public int a = 10;
    private int b = 10;
    private final int c = 10;
    private static int d = 10;
    private static final int e = 10;

    public void test() {
        System.out.println("test");
    }

    public void outerMethod() {

        class LocalClass { // доступен только в этом методе
            public int t; // поле локального класса
            public final static int ttt = 10; // поле локального класса
//         public static int tt; // не компилируется (локальный класс не может иметь статик поле

            // Локальный класс имет доступ ко всем полям Внешнего класса
            public int vv = a;
            public int vvv = b;
            public int vvvv = c;
            public int vvvvv = d;
            public int vvvvvv = e;

            // Метод локального класса
            public void localMethod() {
                System.out.println(vv + vvv + vvvv + vvvvv + vvvvvv);
                OuterClass.this.test(); // вызов метода Внешнего класса из Локального класса
            }
        } // end LocalClass

        LocalClass localClass = new LocalClass(); // в методе Внешнего класса можем создать инстанс Локального класса этого же метода
        localClass.localMethod(); // и вызвать метод Локального класса

    } // end outerMethod

    public static void main(String[] args) {
//        LocalClass localClass2 = new LocalClass(); // невозможно создать инстанс Локального класса из другого метода
//        localClass.localMethod(); // невозможно обратиться к Локальному классу из другого метода
        // Создаем экземпляр Внешнего класса и вызываем его метод содержащий локальный класс
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
