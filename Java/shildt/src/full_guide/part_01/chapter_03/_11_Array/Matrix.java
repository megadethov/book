package full_guide.part_01.chapter_03._11_Array;

/**
 * Created by mega on 22.08.2016.
 */
// Инициализировать двухмерный массив
public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {0 * 0, 1 * 0, 2 * 0, 3 * 0, 4 * 0},
                {0 * 1, 1 * 1, 2 * 1, 3 * 1, 4 * 1},
                {0 * 2, 1 * 2, 2 * 2, 3 * 2, 4 * 2},
                {0 * 3, 1 * 3, 2 * 3, 3 * 3, 4 * 3}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
