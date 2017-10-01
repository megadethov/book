package full_guide.part_01.chapter_18_Collections._02_ArrayListToArray;

import java.util.ArrayList;

/**
 * Created by mega on 07.09.2016.
 */
// Преобразовать ArrayList в обычный массив
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1); // автоупаковка int -> Integer
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);

        // получить обычный массив
        Integer[] integers = new Integer[al.size()];
        integers = al.toArray(integers);

        // суммировать элементы массива
        int sum = 0;
        for (int i : integers) sum += i; // for each

        System.out.println("sum is: " + sum);
    }
}
