package full_guide.part_01.chapter_07._01_Overload;

/**
 * Created by mega on 24.08.2016.
 */
// Продемонстрировать перегрузку методов
public class Overload {
    void test() {
        System.out.println("Метод без параметров");
    }
    void test(int a) {
        System.out.println("Метод с одним параметром int a = " + a);
    }
    void test(int a, int b) {
        System.out.println("Метод с двумя параметрами int a = " + a + " int b = " + b);
    }
    double test (double d) {
        System.out.println("Метод с одним параметром double d = " + d);
        return d * d;
    }
}
