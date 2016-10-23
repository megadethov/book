package full_guide.part_01.chapter_10._04_CatchError;

/**
 * Created by mega on 27.08.2016.
 */
public class CatchError {
    public static void main(String[] args) {
        int a = 0;
        try{
            a /= a;
            System.out.println("no print");
        } catch (Exception e) {
            System.out.println(e);
        } /*catch (ArithmeticException e2) { // has already been cought
            System.out.println(e2);
        }*/
        System.out.println("After try-catch");
    }
}
