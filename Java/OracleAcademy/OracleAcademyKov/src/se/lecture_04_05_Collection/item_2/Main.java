package se.lecture_04_05_Collection.item_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("C++");
        al.add("Java");
        al.add(0, new String("Python")); // добавить в указанную позицию

        System.out.println("First element is " + al.get(0)); // дает элемент листа под индексом 0 (у Collection нет такого метода)

        // все элементы листа
        for(String s : al) {
            System.out.println(s);
        }

    }
}
