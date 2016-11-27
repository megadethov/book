package se.lecture_04_05_Collection.item_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList() - превращает массив в List

        // У коллекций toString() переопределен
        System.out.println(c); // [1, 2, 3, 4, 5]

        // размер коллекции
        System.out.println(c.size()); // 5

        // проверка на пустоту
        System.out.println(c.isEmpty()); // false

        // проверка - содержит ли 4
        System.out.println(c.contains(4)); // true

        // добавление в коллекцию
        c.add(6);
        System.out.println(c); // [1, 2, 3, 4, 5, 6]

        // удалить объект = 1
        c.remove(1);
        System.out.println(c); // [2, 3, 4, 5, 6]

        // Создание новай коллекции с2
        Collection<Integer> c2 = new ArrayList<>(Arrays.asList(3, 4)); // [3, 4]
        // содержит ли коллекция с коллекцию с2
        System.out.println(c.containsAll(c2)); // true

        // в коллекцию с добавляет коллекцию с2
        c.addAll(c2);
        System.out.println(c); // [2, 3, 4, 5, 6, 3, 4]

        // с3 = копия с
        Collection<Integer> c3 = new ArrayList<>(c);
        System.out.println(c3); // [2, 3, 4, 5, 6, 3, 4]

        // из коллекции с удаляются все объекты совпадающие с объектами с2 (дубликаты - все)
        c.removeAll(c2);
        System.out.println(c); // [2, 5, 6]

        // пересечение (в коллекции с3 остаются только те объекты, к-ые есть в с2)
        c3.retainAll(c2);
        System.out.println(c3); // [3, 4, 3, 4]

        // очистить коллекцию
        c.clear();
        System.out.println(c); // []
        System.out.println(c.size()); // 0

    }

}
