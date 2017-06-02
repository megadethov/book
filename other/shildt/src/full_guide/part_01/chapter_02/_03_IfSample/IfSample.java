package full_guide.part_01.chapter_02._03_IfSample;

/**
 * Created by mega on 21.08.2016.
 */
public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;
        if (x < y) System.out.println("x < y");
        x = x * 2;
        if (x == y) System.out.println("x == y");
        x = x * 2;
        System.out.println("x > y");
        if (x == y) System.out.println("never print");
    }
}
