package full_guide.part_01.chapter_18_Collections._20_thanComparing_TreeMap;

import java.util.Comparator;

/**
 * Created by mega on 09.09.2016.
 */
public class CompFullName implements Comparator<String> {
    // Сортировка по ФИО
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
