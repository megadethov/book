package full_guide.part_01.chapter_18_Collections._13_TreeMapDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by mega on 09.09.2016.
 */
// Демо применения TreeMap
public class TreeMapDemo {
    public static void main(String[] args) {

        // создать
        TreeMap<String, Double> accounts = new TreeMap<>();

        // ввести элементы
        accounts.put("Smith", 1000.0);
        accounts.put("Holms", 3000.0);
        accounts.put("Anderson", 2000.0);

        // получить Set записей
        Set<Map.Entry<String, Double>> rec = accounts.entrySet(); // метод Map.entrySet возвращает Set ключей и значений

        // вывести множество записей (ПОРЯДОК - по возрастанию ключей!!!!)
        for (Map.Entry<String, Double> r : rec) {
            System.out.println(r.getKey() + " - " + r.getValue()); // getKey() и getValue - определены в интерфейсе Map.Entry
        }

        // Внести сумму 1000 на счет Smith
        Double balance = accounts.get("Smith");
        accounts.put("Smith", balance + 1000);

        System.out.println("new Smith balance: " + accounts.get("Smith"));

    }
}
