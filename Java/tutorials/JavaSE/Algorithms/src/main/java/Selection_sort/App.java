package Selection_sort;

import java.util.Arrays;

// Алгоритм (для обмена нам нужны индексы ячеек, а не их значения)
// 1) Находим самый меньший элемент(его индекс) - меняем его местами с 1
// 2) Находим самый меньший элемент(его индекс) - меняем его местами с 2
// 3) Находим самый меньший элемент(его индекс) - меняем его местами с 3
// ....................
// Т.о. слева формируется отсортированный массив
// Внешняя граница смещается на 1 вперед после каждой итерации


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

        int frontier = 1; // arr[1] - стартовая позиция границы

        while (frontier < arr.length) {
            int minIndex = frontier-1; // arr[0]

            for (int i = frontier; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) { // сравнить текущий с минимальным
                    minIndex = i; // сохраняем индекс ячейки с минимальным значением
                }
            }
            // обмен элементов
            swap(frontier, minIndex);

            frontier++;
        } // end while

        return arr;
    }

    // обмен элементов
    private void swap(int frontier, int minIndex) {
        int tmp = arr[minIndex];
        arr[minIndex] = arr[frontier - 1];
        arr[frontier - 1] = tmp;
    }




}