package full_guide.part_01.chapter_18_Collections._09_forEach;

import java.util.ArrayList;

/**
 * Created by mega on 08.09.2016.
 */
public class forEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        for (int i : al) {
            System.out.print(i + " ");
        }
        System.out.println();

        // вычислить сумму
        int sum = 0;
        for (int i : al) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
