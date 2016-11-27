package se.lecture_04_05_Collection.item_4;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // AutoBox позволяет добавлять в коллекцию примитивы (автоматом упаковываются в Integer)
        list.add(100);
        System.out.println(list); // [100]
    }
}
