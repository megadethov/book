package full_guide.part_01.chapter_07._10_Recursion;

/**
 * Created by mega on 25.08.2016.
 */
// Рекурсивный вывод элементов массива
public class Recursion {
    int[] arr;

    public Recursion(int val) {
        arr = new int[val];
    }

    // вывести первые n значений массива
    void print(int n) {
        if (n == 0) return;
        else {
            print(n - 1);
            System.out.println(arr[n-1]);
        }
    }
}
