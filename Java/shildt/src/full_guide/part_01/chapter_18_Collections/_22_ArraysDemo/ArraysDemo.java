package full_guide.part_01.chapter_18_Collections._22_ArraysDemo;

import java.util.Arrays;

/**
 * Created by mega on 09.09.2016.
 */
// Демо некоторых методов из класса Arrays
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {23, 2, 45, 2, 458, 2, 456, 23, 4, 5, 67};
        System.out.println("Original array: ");
        display(arr);

        // сортировать массив
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        display(arr);

        // заполнить и вывести
        Arrays.fill(arr, 2, 6, -1); // с 2(вкл) по 6(искл) заполнить значениями = -1
        System.out.println("After fill: ");
        display(arr);

        // сортировать массив
        Arrays.sort(arr);
        System.out.println("Sorted 2 array: ");
        display(arr);

        // выполнить бинарный поиск на от сортированном массиве
       int pos = Arrays.binarySearch(arr, 23);
        System.out.println("Value 23 is located at pos: " + pos);

    }


    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
