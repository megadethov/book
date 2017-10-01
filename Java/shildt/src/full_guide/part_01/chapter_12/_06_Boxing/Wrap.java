package full_guide.part_01.chapter_12._06_Boxing;

/**
 * Created by mega on 29.08.2016.
 */
public class Wrap {
    public static void main(String[] args) {
        int i = 100;
        Integer integer = new Integer(i);
        int b = integer.intValue();
        System.out.println(i);
        System.out.println(integer);
        System.out.println(b);

    }
}
