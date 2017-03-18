package full_guide.part_01.chapter_07._10_Recursion;

/**
 * Created by mega on 25.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Recursion recursion = new Recursion(10);
        for (int i = 0; i < recursion.arr.length; i++) {
            recursion.arr[i] = i;
        }
        recursion.print(5);

    }
}
