package full_guide.part_01.chapter_10._11_MultiCatch;

/**
 * Created by mega on 27.08.2016.
 */
public class MultiCatch {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
//            throw new ArithmeticException();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}

