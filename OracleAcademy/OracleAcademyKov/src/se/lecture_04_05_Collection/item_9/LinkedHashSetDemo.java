package se.lecture_04_05_Collection.item_9;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // дубликатов нет, порядок вставки ПОДДЕРЖИВАЕТСЯ, доступа по индексу нет
        Set<String> set = new LinkedHashSet<>();
        set.add("BBB");
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("BBB");
        set.add("BBB");
        set.add("AAA");
        set.add("BBB");
        System.out.println(set);
    }
}
