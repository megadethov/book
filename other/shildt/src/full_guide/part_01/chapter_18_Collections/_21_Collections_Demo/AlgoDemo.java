package full_guide.part_01.chapter_18_Collections._21_Collections_Demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by mega on 09.09.2016.
 */
// Продемонстрировать применение различных алгоритмов Collections
public class AlgoDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(20);
        ll.add(-8);
        ll.add(-20);
        ll.add(8);
        ll.add(0);
        ll.add(100);
        ll.add(64);

        // создать компаратор с обратным упорядочением
        Comparator<Integer> comp = Collections.reverseOrder();

        // отсортировать список с помощью этого компаратора
        Collections.sort(ll, comp);
        // список отсортирован в обратном порядке
        System.out.println(ll);

        // Перетасовать список
        Collections.shuffle(ll);
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // найти max / min
        System.out.println("max: " + Collections.max(ll)); // не требуют отсортированного списка
        System.out.println("min: " + Collections.min(ll)); // не требуют отсортированного списка




    }
}
