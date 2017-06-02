package full_guide.part_01.chapter_18_Collections._23_VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by mega on 10.09.2016.
 */
// Продемонстрировать различные операции с вектором
public class VectorDemo {
    public static void main(String[] args) {
        // начальный размер 3, инкремент 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Size: " + v.size()); // 0
        System.out.println("Capacity: " + v.capacity()); // 3

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("Capacity after entered 4 elements: " + v.capacity()); // 5 тк инкремент 2

        v.add(5);
        System.out.println("Current Capacity: " + v.capacity()); // 5

        v.add(6);
        v.add(7);
        System.out.println("Current Capacity: " + v.capacity()); // 7

        v.add(9);
        v.add(10);
        System.out.println("Current Capacity: " + v.capacity());

        v.add(11);
        v.add(12);

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if (v.contains(3)) System.out.println("Vector has a 3");

        // перечислить элементы Vector (вар-1)
        Enumeration<Integer> enumeration = v.elements(); //  устаревший итератор
        while (enumeration.hasMoreElements()) System.out.print(enumeration.nextElement() + " ");
        System.out.println();

        // перечислить элементы Vector (вар-2)
        Iterator<Integer> iter = v.iterator();
        while (iter.hasNext()) System.out.print(iter.next() + " ");
        System.out.println();

        // перечислить элементы Vector (вар-3)
        for (int i : v) {
            System.out.print(i + " ");
        }

    }
}
