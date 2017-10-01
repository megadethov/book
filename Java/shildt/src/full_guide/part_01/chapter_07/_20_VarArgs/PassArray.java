package full_guide.part_01.chapter_07._20_VarArgs;

/**
 * Created by mega on 25.08.2016.
 */
// Старый способ (до SE5) передавать методу неограниченное число аргументов - массивю
public class PassArray {
    void print(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {10, 20, 30, 40, 50};

        PassArray passArray = new PassArray();
        passArray.print(arr);
        passArray.print(arr2);
        passArray.print(arr3);
    }


}

