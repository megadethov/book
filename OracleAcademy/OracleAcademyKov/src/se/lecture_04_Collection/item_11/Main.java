package se.lecture_04_Collection.item_11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // создаем HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "DDDD");
        map.put(12, "BBB");
        map.put(1, "AA");
        map.put(29, "BBB");

        // вложенный класс Map.Entry, содержит одну запись key-value
        // взять кеу, value у этой записи можно с помощью методов getKey(), getValue()
        for (Map.Entry<Integer, String> entry : map.entrySet()) { // entrySet() вернет нам Set всех записей Entry
            System.out.println(entry.getKey() + " - " + entry.getValue()); // в цикле выводим key - value
        }

        System.out.println("==================================================");

        // можем взять Set ключей у Map
        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key)); // выводим в цикле ключи и по ключам значения
        }

        System.out.println("==================================================");

        // можем взять Collection значений у Map
        for (String value : map.values()) {
            System.out.println(value); // можем в цикле вывести эти значения
        }

    }
}
