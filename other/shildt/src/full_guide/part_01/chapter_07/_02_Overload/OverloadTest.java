package full_guide.part_01.chapter_07._02_Overload;

/**
 * Created by mega on 24.08.2016.
 */
// test() для int отсутствует
public class OverloadTest {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int i = 10;
        overload.test(i);
    }
}
