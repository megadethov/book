package full_guide.part_01.chapter_12._07_AutoBoxing;

/**
 * Created by mega on 29.08.2016.
 */
public class AutoBox2 {
    public static void main(String[] args) {
        System.out.println(box(100));
    }
    public static int box(Integer integer) {
        Integer res = integer;
        return res;
    }
}
