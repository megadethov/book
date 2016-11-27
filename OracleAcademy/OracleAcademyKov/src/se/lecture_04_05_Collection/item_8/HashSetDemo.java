package se.lecture_04_05_Collection.item_8;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // дубликатов нет, порядок вставки не поддерживается, доступа по индексу нет
        Set<String> set = new HashSet<>();
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
