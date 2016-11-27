package se.lecture_01_AdvancedClasses.inner_nested_classes.inner;

/**
 * Created by Yefremov Yuriy
 */
public class OuterClass { // класс
    // поля класса
    public int a = 10;
    private int b = 10;
    private final int c = 10;
    private static int d = 10;

    // в методах Outer класса я могу создавать инстансы Inner класса
    public void outerMethod(){
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

    // метод Outer класса
    public void test(){
        System.out.println("test");
    }
// Внутренний класс - no static nested
    class InnerClass {
//        static int i; // не компилируется, не может содержать статику

        public void innerMethod() {
            System.out.println(a + b + c + d);
            OuterClass.this.test(); // обращение к методу обрамляющего класса
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(); // инстанс Outer лласса
        outerClass.outerMethod(); // вызов метода Outer объекта

        System.out.println("-----------------------");

// в статик методе инстанс Inner класса создается ч/з Outer
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();

        System.out.println(outerClass.new InnerClass());
        System.out.println(outerClass);
    }
}

