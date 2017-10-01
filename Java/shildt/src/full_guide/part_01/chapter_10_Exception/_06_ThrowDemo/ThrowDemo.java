package full_guide.part_01.chapter_10._06_ThrowDemo;

/**
 * Created by mega on 27.08.2016.
 */
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new NullPointerException("GenConstructor throw");
//            System.out.println(1); // unreachable statement
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
