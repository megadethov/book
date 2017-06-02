package se.lecture_04_05_Collection.item_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
//        List<Integer> ls = Arrays.asList(0, 1, 2, 3, 3, -4); // так получим immutable ArrayList
//        ls.add(100); // UnsupportedOperationException
        List<Integer> ls = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 3, -4)); // теперь ок

        // найти максимальное значение в коллекции
        // вторым аргументом может быть Comparator
        System.out.println(Collections.max(ls)); // 3
        // найти минимальное значение в коллекции
        System.out.println(Collections.min(ls)); // -4

        // найти частоту вхождения элемента в коллекцию
        System.out.println(Collections.frequency(ls, 2)); // 1 раз
        System.out.println(Collections.frequency(ls, 3)); // 2 раз

        // меняем порядок элементов на противоположный
        Collections.reverse(ls);
        System.out.println(ls); // [-4, 3, 3, 2, 1, 0]

        // сдвигаем список циклически на n элементов
        Collections.rotate(ls, 1);
        System.out.println(ls); // [0, -4, 3, 3, 2, 1]

        // создать коллекцию из 3 в кол-ве 2
        List<Integer> sublist = Collections.nCopies(2, 3); // immutable
//        List<Integer> sublist = new ArrayList<>(Collections.nCopies(2, 3)); // mutable
        System.out.println(sublist); // [3, 3]
//        sublist.add(2); // UnsupportedOperationException

        // определить индекс вхождения саблиста в лист
        System.out.println(Collections.indexOfSubList(ls, sublist)); // индекс вхождения саблиста = 2

        // перемешать элементы List в случайном порядке
        Collections.shuffle(ls);
        System.out.println(ls); // [0, 2, 1, 3, 3, -4] (один из вариантов)

        // заполнить коллекцию - 8
        Collections.fill(ls, 8);
        System.out.println(ls); // [8, 8, 8, 8, 8, 8]

        // скопировать коллекцию ls в lsCopy (lsCopy - должен быть больше источника иначе IndexOutOfBoundsException: Source does not fit in dest)
        List<Integer> lsCopy = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        Collections.copy(lsCopy, ls);
        System.out.println(lsCopy); // [8, 8, 8, 8, 8, 8, 1, 1, 1, 1]

        // поменять местами элементы
        Collections.swap(lsCopy, 0, lsCopy.size() - 1); // первый с последним
        System.out.println(lsCopy); // [1, 8, 8, 8, 8, 8, 1, 1, 1, 8]

        // заменить все копии указанного элемента
        Collections.replaceAll(lsCopy, 8, 0); // 8 на 0
        System.out.println(lsCopy); // [1, 0, 0, 0, 0, 0, 1, 1, 1, 0]

    }
}
