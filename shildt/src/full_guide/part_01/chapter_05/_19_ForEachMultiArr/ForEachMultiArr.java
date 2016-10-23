package full_guide.part_01.chapter_05._19_ForEachMultiArr;

/**
 * Created by mega on 24.08.2016.
 */
// for each по двухмерному массиву
public class ForEachMultiArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50}
        };
        for (int[] outer : arr) {
            for (int inner : outer) {
                System.out.print(" " + inner);
            }

        }
    }
}
