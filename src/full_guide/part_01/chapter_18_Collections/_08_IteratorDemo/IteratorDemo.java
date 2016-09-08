package full_guide.part_01.chapter_18_Collections._08_IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by mega on 08.09.2016.
 */
// Продемнстрировать применение итератров
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("F");

        // Использовать итераторы для вывода содержимого ArrayList
        Iterator<String> itr = al.iterator();
        while (itr.hasNext())
        {
            String elem = itr.next();
            System.out.print(elem + " ");
        }

        // Изменить перебираемые элементы
        ListIterator<String> listItr = al.listIterator();
        while (listItr.hasNext()) {
            String elem = listItr.next();
            listItr.set(elem + "+"); // set() присутствует только у ListIterator
        } // ПОСЛЕ ЭТОГО ПРОБЕГА listItr указывает на конец списка
        System.out.println();

        // Отобразить измененный ArrayList
        itr = al.iterator();
        while (itr.hasNext()) {
            String elem = itr.next();
            System.out.print(elem + " ");
        }
        System.out.println();

        // А теперь отобразить в обратном порядке
//        listItr = al.listIterator(); // если взять новый listIterator - он указывает на первый элемент и
//        hasPrevious = false всегда. Поэтому берем уже пробежавший listIterator, к-ый указывает на конец.
        while (listItr.hasPrevious()) {
            String elem = listItr.previous();
            System.out.print(elem + " ");
        }

    }
}
