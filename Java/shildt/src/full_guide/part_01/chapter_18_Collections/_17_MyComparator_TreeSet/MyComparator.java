package full_guide.part_01.chapter_18_Collections._17_MyComparator_TreeSet;

import java.util.Comparator;

/**
 * Created by mega on 09.09.2016.
 */
// Comparator для реверсного порядка
public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        // для реверса порядка меняем местами объекты
//        return o1.compareTo(o2); // для String compareTo() реализован
        return o2.compareTo(o1); // для String compareTo() реализован
    }
    // переопределять equals() не требуется
}
