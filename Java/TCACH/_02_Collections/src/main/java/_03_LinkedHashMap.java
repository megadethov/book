import java.util.HashMap;
import java.util.LinkedHashMap;

public class _03_LinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");

        // Integer hashcode - свое значение, порядок не гарантируется, поэтому по хешкоду
        System.out.println(map); // 1=e, 2=d, 3=c, 4=b, 5=a

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(5, "a");
        map2.put(4, "b");
        map2.put(3, "c");
        map2.put(2, "d");
        map2.put(1, "e");

        // По порядку вставки
        System.out.println(map2); // 5=a, 4=b, 3=c, 2=d, 1=e
    }
}
