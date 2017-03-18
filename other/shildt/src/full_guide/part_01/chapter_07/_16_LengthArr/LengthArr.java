package full_guide.part_01.chapter_07._16_LengthArr;

/**
 * Created by mega on 25.08.2016.
 */
// Применение поля массива length
public class LengthArr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int[] arr2 = new int[100];
        arr2[0] = 10;
        arr2[1] = 20;

        System.out.println(arr.length);
        System.out.println(arr2.length);
    }
}
