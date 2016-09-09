package full_guide.part_01.chapter_18_Collections._19_MyComparator_TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by mega on 09.09.2016.
 */
public class Demo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new MyComparator());
        tm.put("Aname Esoname", 2000.0);
        tm.put("Bname Dsoname", 1000.0);
        tm.put("Aname Asoname", 2000.0);
        tm.put("Dname Bsoname", 3000.0);
        tm.put("Ename Dsoname", 2000.0);

        // Получить Set записей(ключб значение)
        Set<Map.Entry<String, Double>> rec = tm.entrySet();

        // Вывести элементы Set
        for (Map.Entry<String, Double> elem : rec) {
            System.out.println(elem.getKey() + " - " + elem.getValue() ); // сорт по фамилии, затем по имени
        }

        // Внести сумму на счет Aname Asoname
        Double elem = tm.get("Aname Asoname");
        tm.put("Aname Asoname", elem + 10000.0);

        System.out.println("accaunt Aname Asoname: " + tm.get("Aname Asoname"));
    }
}

