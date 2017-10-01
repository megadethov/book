package full_guide.part_01.chapter_18_Collections._20_thanComparing_TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by mega on 09.09.2016.
 */
public class Demo {
    public static void main(String[] args) {
        // создание компаратора, к-ый сравнивает сначала по фамилии, а при совпадении по ФИО
        CompLastName compLastName = new CompLastName(); // экземпляр компаратора по Фамилии
        Comparator<String> comp = compLastName.thenComparing(new CompFullName()); // скручиваем 2 компаратора через thenComparing()

        TreeMap<String, Double> tm = new TreeMap<>(comp);

        tm.put("Aname Esoname", 2000.0);
        tm.put("Bname Dsoname", 1000.0);
        tm.put("Aname Asoname", 2000.0);
        tm.put("Dname Bsoname", 3000.0);
        tm.put("Ename Dsoname", 2000.0);

        Set<Map.Entry<String, Double>> rec = tm.entrySet();
        for (Map.Entry<String, Double> elem : rec) {
            System.out.println(elem.getKey() + " - " + elem.getValue());

        }
    }
}
