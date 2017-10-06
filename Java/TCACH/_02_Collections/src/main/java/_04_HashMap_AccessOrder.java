import java.util.HashMap;
import java.util.LinkedHashMap;

public class _04_HashMap_AccessOrder {
    public static void main(String[] args) {
//            HashMap<Integer, String> map = new HashMap<>(32, 0.8F); // initial capacity, load factor
            LinkedHashMap<Integer, String> map = new LinkedHashMap<>(32, 0.8F, true); // true - в порядке возрастания get по ключам
            map.put(5, "a");
            map.put(4, "b");
            map.put(3, "c");
            map.put(2, "d");
            map.put(1, "e");

        map.get(5);
        map.get(3); // будет последним - ПОСЛЕДНИЙ самый юзаемый ключ. (В LinkedHashSet такого нет).

        System.out.println(map); // 4=b, 2=d, 1=e, 5=a, 3=c

        // Юзабельно для устройства кеша, можно удалять из кеша самые не юзаемые элементы
        // Для этого есть спец. метод - removeEldestEntry. Ручками его не вызываем.
        // Для того, того, чтобы он заработал, фиксим размер - loadFactor > 1.

    }
}
