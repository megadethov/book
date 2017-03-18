package full_guide.part_01.chapter_18_Collections._25_HashtableDemo;

import java.util.*;

/**
 * Created by mega on 10.09.2016.
 */
// Продемонстрировать применение класса Hashtable
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> ht = new Hashtable<>();
        ht.put("Aname Dlastname", 1000.0);
        ht.put("Bname Clastname", 3000.0);
        ht.put("Cname Blastname", 2000.0);
        ht.put("Dname Alastname", 1000.0);

        String str; // для хранения ключей

        // получить Enumeration
        Enumeration<String> en = ht.keys(); // работает только для ключей, без значений

        // прочитать хеш-таблицу
        while (en.hasMoreElements()) {
            str = en.nextElement();
            System.out.println(str + " " + ht.get(str)); // возвращает текущий и смещается на 1
        }

        // изменить баланс Aname Dlastname
        ht.put("Aname Dlastname", ht.get("Aname Dlastname") + 10000);
        System.out.println("Aname Dlastname new balance: " + ht.get("Aname Dlastname"));

        // вывести все рекорды с помощью итератора
        // получить Set ключей методом Hashtable.keySet()
        Set<String> setKeys = ht.keySet();

        // создать итератор по сету ключей
        Iterator<String> iter = setKeys.iterator();
        System.out.println();

        // вывод
        while (iter.hasNext()) {
            str = iter.next();
            System.out.println(str + " " + ht.get(str));

        }

    }
}
