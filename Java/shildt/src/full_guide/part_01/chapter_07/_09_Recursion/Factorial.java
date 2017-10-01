package full_guide.part_01.chapter_07._09_Recursion;

/**
 * Created by mega on 24.08.2016.
 */
public class Factorial {
    int fact(int i) {
        if (i == 1) return 1;
        else {
            return fact(i - 1) * i;
        }
    }
}
