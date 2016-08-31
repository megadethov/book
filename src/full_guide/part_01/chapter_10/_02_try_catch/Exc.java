package full_guide.part_01.chapter_10._02_try_catch;

/**
 * Created by mega on 27.08.2016.
 */
public class Exc {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
            System.out.println("no print");
        } catch (ArithmeticException e) {
            System.out.println("/ by 0");
        }
        System.out.println("After try-catch");
    }
}
