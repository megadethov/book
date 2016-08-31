package full_guide.part_01.chapter_03._10_Promotion;

/**
 * Created by mega on 21.08.2016.
 */
public class Promote2 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67F;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f*b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
