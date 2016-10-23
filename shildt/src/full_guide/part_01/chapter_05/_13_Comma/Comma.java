package full_guide.part_01.chapter_05._13_Comma;

/**
 * Created by mega on 24.08.2016.
 */
// Использование запятой в операторе цикла for
public class Comma {
    public static void main(String[] args) {
        int a, b;
        for (a = 0, b = 10; a <= b; a++, b--) {
            System.out.println("a = " + a + " b = " + b);
        }
    }
}
