package full_guide.part_01.chapter_12._07_AutoBoxing;

/**
 * Created by mega on 29.08.2016.
 */
public class AutoBox3 {
    public static void main(String[] args) {
        int i;
        Integer ob, ob2;

        ob = 100;
        ++ob;

        i = ob;

        ob2 = i + ob + (ob / 3);
    }
}
