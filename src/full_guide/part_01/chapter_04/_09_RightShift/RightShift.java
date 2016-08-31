package full_guide.part_01.chapter_04._09_RightShift;

/**
 * Created by mega on 22.08.2016.
 */
public class RightShift {
    public static void main(String[] args) {
        int i = 32;
        int k = 35;
        int j = -8;

        /*
        0000 0000 0000 0000 0000 0000 0010 0000 = 32
        0000 0000 0000 0000 0000 0000 0000 1000 = 8
        */
        System.out.println(i + " >> 2 = " + (i >> 2));

        /*
        0000 0000 0000 0000 0000 0000 0010 0011 = 35
        0000 0000 0000 0000 0000 0000 0000 1000 = 8
        */
        System.out.println(k + " >> 2 = " + (k >> 2));

        /*
        1111 1111 1111 1111 1111 1111 1111 0111 = -9    - (0*1 + 0*2 + 0*4 + 8) - (1)
        1111 1111 1111 1111 1111 1111 1111 1011 = -5
        */
        System.out.println(j + " >> 1 = " + (j >> 1));

       /*
       1111 1111 1111 1111 1111 1111 1111 1111 = -1
       */
        System.out.println(Integer.toBinaryString(-1 >> 1)); // всегда -1

    }
}
