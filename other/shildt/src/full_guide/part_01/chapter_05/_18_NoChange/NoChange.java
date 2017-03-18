package full_guide.part_01.chapter_05._18_NoChange;

/**
 * Created by mega on 24.08.2016.
 */
public class NoChange {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i : arr) {
            System.out.print(" " + i);
            i *= 2; // этот опеатор не оказывает никакого влияния на массив
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
