package Bubble_sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {12, 13, 24, 10, 3, 6, 90, 70};
        Sorter sorter = new Sorter(arr);

        System.out.println(Arrays.toString(sorter.sort()));
    }
}

class Sorter {
    private int[] arr;

    public Sorter(int[] arr) {
        this.arr = arr;
    }

    public int[] sort() {
        int frontier = arr.length; // стартовое положение границы между отсортированной и не отсортированной частью. Со старта = длине массива
        while (frontier > 1) { // граница
            // один проход пузырька до границы
            for (int i = 1; i < frontier; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(i); // обмен элементов
                }
            }
            frontier--; // после каждого прохода граница смещается
        }

        return arr;
    }

    // обмен элементов
    private void swap(int i) {
        int tmp = arr[i - 1];
        arr[i - 1] = arr[i];
        arr[i] = tmp;
    }


}