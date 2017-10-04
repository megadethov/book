package se.lecture_04_05_Collection.item_11;

import java.util.HashMap;
import java.util.Map;

public class $Main {
    public static void main(String[] args) {
        // создаем HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "DDDD");
        map.put(12, "BBB");
        map.put(1, "AA");
        map.put(29, "BBB");

        // вложенный класс Map.Entry, содержит одну запись key-value
        // взять кеу, value у этой записи можно с помощью методов getKey(), getValue()
        for (Map.Entry<Integer, String> next : map.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

        System.out.println("==================================================");

        // можем взять Set ключей у Map

        for (Integer next : map.keySet()) {
            System.out.println(next);
        }

        System.out.println("==================================================");

        // можем взять Collection значений у Map
        for (String next : map.values()) {
            System.out.println(next);
        }

    }
}
