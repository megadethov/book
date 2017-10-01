package full_guide.part_01.chapter_03._05_DynInit;

/**
 * Created by mega on 21.08.2016.
 */
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
