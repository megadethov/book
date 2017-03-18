package full_guide.part_01.chapter_10._03_FewCatches;

/**
 * Created by mega on 27.08.2016.
 */
public class FewCatches {
    public static void main(String[] args) {
        int a = 1;
        int[] b = {11};
        try{
            a /= a;
            b[3] = 1000;
            System.out.println("no print");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);
        }
        System.out.println("After try-catch");
    }
}
