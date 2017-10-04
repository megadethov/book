package se.lecture_04_05_Collection.item_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class $CollectionDemo {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList() - превращает массив в List
        Collection<Integer> b = new ArrayList<>(Arrays.asList(2, 3, 4)); // Arrays.asList() - превращает массив в List

        c.retainAll(b); // 2, 3, 4

        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Integer[] objects = c.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));
    }

}
