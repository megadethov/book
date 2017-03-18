package full_guide.part_01.chapter_03._11_Array;

/**
 * Created by mega on 22.08.2016.
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 5; k++) {
                twoD[i][k] = counter;
                System.out.print(twoD[i][k] + " ");
                counter++;
            }
            System.out.println();
        }

    }
}
