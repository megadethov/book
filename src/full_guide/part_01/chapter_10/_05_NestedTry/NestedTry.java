package full_guide.part_01.chapter_10._05_NestedTry;

/**
 * Created by mega on 27.08.2016.
 */
public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = 1; // 0 or 1
            int[] arr = {33};
            int b = 42 / a;
            System.out.println("a = " + a);

            try { // вложенный блок try
                if (a != 0) System.out.println(arr[a]);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println(e2);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
