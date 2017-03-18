package full_guide.part_01.chapter_07._01_Overload;

/**
 * Created by mega on 24.08.2016.
 */
public class OverloadTest {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(1);
        overload.test(2, 3);
        double res = overload.test(5.5);

        System.out.println("overload.test(5.5) возвращает: " + res);

    }
}
