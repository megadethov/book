package full_guide.part_01.chapter_05._17_ForEach;

/**
 * Created by mega on 24.08.2016.
 */
public class ForEach2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : arr) {
            System.out.print(" " + i);
            if (i == 5) break;
        }
    }
}
