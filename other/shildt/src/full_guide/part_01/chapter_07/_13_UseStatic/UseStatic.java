package full_guide.part_01.chapter_07._13_UseStatic;

/**
 * Created by mega on 25.08.2016.
 */
// Продемонстрировать статические переменные, методы и блоки кода
public class UseStatic {
    static int a = 3;
    static int b;

    static void f(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

     static {
         System.out.println("Секция инициализации");
         b = a * 3;
     }

    public static void main(String[] args) {
        f(1);
    }

}
