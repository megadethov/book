package full_guide.part_01.chapter_07._02_Overload;

/**
 * Created by mega on 24.08.2016.
 */
// Авто преобразование типов к перегрузке
public class Overload {
    void test() {
        System.out.println("test() без параметров");
    }

    void test(double d) {
        System.out.println("test (double d) d = " + d);
    }
}
