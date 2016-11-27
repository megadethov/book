package se.lecture_04_05_Collection.item_15;

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        Deque<String> d = new LinkedList<>();
        d.add("DD");
        d.add("DD");
        d.add("AA");
        d.add("CC");

        System.out.println(d);

        d.addFirst("First");
        d.addLast("Last");

        System.out.println(d);

        // все методы аналогичны классу Queue только направленный на обе стороны очереди
    }
}
