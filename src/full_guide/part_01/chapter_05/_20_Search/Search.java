package full_guide.part_01.chapter_05._20_Search;

/**
 * Created by mega on 24.08.2016.
 */
public class Search {
    public static void main(String[] args) {
        int[] arr = {23, 4, 245, 6, 76, 2};
        int value = 7;
        boolean isFind = false;

        for (int i : arr) {
            if (i == value) {
                isFind = true;
                break;
            }
        }
        if (isFind) System.out.println(value + " is find");
        else System.out.println(value + " is not find");
    }
}
