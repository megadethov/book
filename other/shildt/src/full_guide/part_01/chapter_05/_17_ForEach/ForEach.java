package full_guide.part_01.chapter_05._17_ForEach;

/**
 * Created by mega on 24.08.2016.
 */
// Применение цикла for в стиле for each
public class ForEach {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i : arr) {
            System.out.println("val = " + i);
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
