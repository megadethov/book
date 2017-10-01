package full_guide.part_01.chapter_03._11_Array;

/**
 * Created by mega on 22.08.2016.
 */
// Резервирование памяти вручную для массива с разной
// размерностью второго измерения
public class TwoDArray2 {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[3];
        twoD[1] = new int[20];
        twoD[2] = new int[10];
        twoD[3] = new int[10];
//        twoD[4] = new int[50]; // java.lang.ArrayIndexOutOfBoundsException


    }
}
