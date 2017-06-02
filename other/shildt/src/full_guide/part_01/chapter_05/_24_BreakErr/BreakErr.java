package full_guide.part_01.chapter_05._24_BreakErr;

/**
 * Created by mega on 24.08.2016.
 */
public class BreakErr {
    public static void main(String[] args) {
        mark:
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
//            if (val == 5) break mark; // not compile
        }
    }
}
