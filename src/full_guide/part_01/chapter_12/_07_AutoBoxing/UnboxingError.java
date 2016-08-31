package full_guide.part_01.chapter_12._07_AutoBoxing;

/**
 * Created by mega on 30.08.2016.
 */
public class UnboxingError {
    public static void main(String[] args) {
        Integer obj = 1000;
        int i = obj.byteValue();
        System.out.println(i); // -24
    }
}
