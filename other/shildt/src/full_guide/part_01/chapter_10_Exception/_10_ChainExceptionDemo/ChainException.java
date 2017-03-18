package full_guide.part_01.chapter_10._10_ChainExceptionDemo;

/**
 * Created by mega on 27.08.2016.
 */
public class ChainException {
    public static void main(String[] args) {
            try {
                f();
            } catch (NullPointerException e) {
                System.out.println(e + "\nCause:\n " + e.getCause());
            }
    }

    static void f() {
        NullPointerException e = new NullPointerException("exception 2");
        e.initCause(new ArithmeticException("exception 1")); // initCause работает только 1 раз для текущего исключения
        throw e;
    }
}
