package se.lecture_04_Collection.item_13;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> tm = new TreeMap<>();
        tm.put("key-4", "value-100");
        tm.put("key-2", "value-400");
        tm.put("key-5", "value-300");
        tm.put("key-1", "value-500");
        tm.put("key-3", "value-200");

        // String implements Comparable и сортирует в лексикографическом порядке по ключам
        System.out.println(tm);

        for (Map.Entry<String, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}



