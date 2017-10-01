package full_guide.part_01.chapter_10._02_try_catch;

/**
 * Created by mega on 27.08.2016.
 */
public class HandleErrorToString {
    public static void main(String[] args) {
        try{
            for (int i = 10; i >= 0 ; i--) {
                System.out.println(100 / i);
            }
            System.out.println("no print");
        } catch (ArithmeticException e) {
            System.out.println(e.toString()); // toString переопределен в классе Throwable
        }
        System.out.println("After try-catch");
    }
}
