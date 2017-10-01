package full_guide.part_01.chapter_04._11_UnsignedRightShift;

/**
 * Created by mega on 23.08.2016.
 */
// Демо беззнаковый сдвиг вправо
public class UnsignedRightShift {
    public static void main(String[] args) {
        int i = -1;

       /*
       1111 1111 1111 1111 1111 1111 1111 1111     = -1
       0000 0000 0000 0000 0000 0000 1111 1111     = 255
       */

        System.out.println(i + " >>> 24 = " + (i >>> 24));
    }
}
