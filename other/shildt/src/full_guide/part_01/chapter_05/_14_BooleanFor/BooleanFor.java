package full_guide.part_01.chapter_05._14_BooleanFor;

/**
 * Created by mega on 24.08.2016.
 */
public class BooleanFor {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 0; !flag ; i++) {
            System.out.print(" " + i);
            if (i == 9) flag = true;
        }
    }
}
