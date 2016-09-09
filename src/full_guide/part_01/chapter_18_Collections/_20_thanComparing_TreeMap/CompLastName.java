package full_guide.part_01.chapter_18_Collections._20_thanComparing_TreeMap;

import java.util.Comparator;

/**
 * Created by mega on 09.09.2016.
 */
public class CompLastName implements Comparator<String> {
    @Override
    // сортировка по фамилии
    public int compare(String o1, String o2) {
        int i, j, k;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
