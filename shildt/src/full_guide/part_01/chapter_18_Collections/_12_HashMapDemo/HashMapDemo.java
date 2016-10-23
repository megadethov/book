package full_guide.part_01.chapter_18_Collections._12_HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mega on 09.09.2016.
 */
// Прменение HashMap для хранения банковских счетов
public class HashMapDemo {
    public static void main(String[] args) {

        // создать
        HashMap<String, Double> accounts = new HashMap<>();

        // ввести элементы
        accounts.put("Smith", 1000.0);
        accounts.put("Holms", 3000.0);
        accounts.put("Anderson", 2000.0);

        // получить Set записей
        Set<Map.Entry<String, Double>> rec = accounts.entrySet(); // метод Map.entrySet возвращает Set ключей и значений

        // вывести множество записей (ПОРЯДОК НЕ ПОДДЕРЖИВАЕТСЯ)
        for (Map.Entry<String, Double> r : rec) {
            System.out.println(r.getKey() + " - " + r.getValue()); // getKey() и getValue - определены в интерфейсе Map.Entry
        }

        // Внести сумму 1000 на счет Smith
        Double balance = accounts.get("Smith");
        accounts.put("Smith", balance + 1000);

        System.out.println("new Smith balance: " + accounts.get("Smith"));


    }
}
