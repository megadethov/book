package full_guide.part_01.chapter_03._10_Promotion;

/**
 * Created by mega on 21.08.2016.
 */
public class Promote {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int i = a * b / c;

        System.out.println(i);

//        a = b * c; // incompatible types
    }
}
