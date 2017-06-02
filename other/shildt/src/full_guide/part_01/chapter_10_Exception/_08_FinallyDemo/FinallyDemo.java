package full_guide.part_01.chapter_10._08_FinallyDemo;

/**
 * Created by mega on 27.08.2016.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            if (true) throw new RuntimeException();
            System.out.println(1);
        } catch (/*NullPointerException*/ Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }
}
