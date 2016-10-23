package full_guide.part_01.chapter_03._11_Array;

/**
 * Created by mega on 22.08.2016.
 */
// Продемонстрировать трехмерный массив
public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.print("     ");
            }
            System.out.println();
        }
    }
}
